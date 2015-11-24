package game;

import java.awt.Color;
import desktop_fields.Brewery;
import desktop_fields.Shipping;
import desktop_fields.Street;
import desktop_resources.GUI;

public abstract class Field {
    
    protected String fieldname;
    protected static Field[] field;
    
    public static Field[] createFields() {
        
        field = new Field[] { 
            new Territory ("Tribe Encampment", 100, 1000),
            new Territory ("Crater", 300, 1500),
            new Territory ("Mountain", 500, 2000),
            new Territory ("Cold Desert", 700, 3000),
            new Territory ("Black Cave", 1000, 4000),
            new Territory ("The WereWall", 1300, 4300),
            new Territory ("Mountain Village", 1600, 4750),
            new Territory ("South Citadel", 2000, 5000),
            new Territory ("Palace Gates", 2600, 5500),
            new Territory ("Tower", 3200, 6000),
            new Territory ("Castle", 4000, 8000),
            new Refuge ("Walled City", 5000),
            new Refuge ("Monastery", 500),
            new Labor ("Huts int the mountain"),
            new Labor ("The Pit"),
            new Tax ("Goldmine", 2000),
            new Tax ("Caravan", 4000),
            new Fleet ("Second Sail"),
            new Fleet ("Sea Grover"),
            new Fleet ("The Buccaneers"),
            new Fleet ("Privateer Armade")
        };
        
        desktop_fields.Field list[] = new desktop_fields.Field[field.length];
        
        for (int i = 0; i < field.length; i++) {
            Field fields = field[i];
            if (fields instanceof Territory) {
                list[i] = new Street.Builder()
                    .setTitle(field[i].fieldname)
                    .setDescription("Rent: "+field[i].getRent()+"")
                    .setSubText("Costs: "+field[i].getPrice()+"")
                    .setBgColor(Color.YELLOW)
                    .setFgColor(Color.RED)
                    .build();
                
            } else if (fields instanceof Refuge) {
                list[i] = new desktop_fields.Refuge.Builder()
                    .setTitle(field[i].fieldname)
                    .setDescription("Bonus: "+field[i].getRent()+"")
                    .setSubText("Costs: "+field[i].getPrice()+"")
                    .setBgColor(Color.YELLOW)
                    .setFgColor(Color.RED)
                    .build();
                
            } else if (fields instanceof Labor) {
                list[i] = new Brewery.Builder()
                    .setTitle(field[i].fieldname)
                    .setDescription("Rent: 100xDices")
                    .setSubText("Pay 100 x DiceSum")
                    .setBgColor(Color.RED)
                    .setRent(""+field[i].getRent())
                    .setPicture(field[i].getName())
                    .build(); 
            } else if (fields instanceof Tax) {
                list[i] = new desktop_fields.Tax.Builder()
                    .setTitle(field[i].fieldname)
                    .setDescription("TAX: "+field[i].getRent()+"")
                    .setSubText("Rent: "+field[i].getRent()+"")
                    .setBgColor(Color.RED)
                    .build(); 
            } else if (fields instanceof Fleet) {
                list[i] = new Shipping.Builder()
                    .setTitle(field[i].fieldname)
                    .setDescription("Rent: 500-4000")
                    .setSubText("500 per owned Fleet")
                    .setBgColor(Color.YELLOW)
                    .setRent("500-4000")
                    .build();
            }
        }
        GUI.create(list);
        return field;
    }
    
    
    public abstract void landOnField(Player player);  
    
    public static int getNumberOfFields() {
        return field.length;
    }
    
    public String getName() {
        return fieldname;
    }
    
    public Field(String name) {
        this.fieldname = name;
    }
    
    public abstract int getRent();
    public abstract int getPrice();
    
    
}