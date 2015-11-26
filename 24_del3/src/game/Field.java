package game;

import java.awt.Color;
import java.util.Arrays;
import java.util.Collections;

import desktop_fields.Brewery;
import desktop_fields.Shipping;
import desktop_fields.Street;
import desktop_resources.GUI;

public abstract class Field {
    
    protected String fieldname;
    protected Dice dice;
    protected static Field[] field;
    
    /**
     * creates the fields for both the GUI and gamelogic to interact with.
     * @return Field[]
     */
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
            new Labor ("Huts"),
            new Labor ("The Pit"),
            new Tax ("Goldmine", 2000),
            new Tax ("Caravan", 4000),
            new Fleet ("Second Sail"),
            new Fleet ("Sea Grover"),
            new Fleet ("Buccaneers"),
            new Fleet ("Armade")
        };
        
        desktop_fields.Field list[] = new desktop_fields.Field[field.length];
        
        // We shuffle the array list field, so every game has a random board.
        java.util.List<?> lists = (java.util.List<?>) Arrays.asList(field);
        Collections.shuffle(lists);
        
        for (int i = 0; i < field.length; i++) {
            Field fields = field[i];
            if (fields instanceof Territory) {
                list[i] = new Street.Builder()
                    .setTitle(field[i].fieldname)
                    .setSubText("Costs: "+field[i].getPrice()+"")
                    .setDescription("Rent: "+field[i].getRent()+"")
                    .setBgColor(Color.DARK_GRAY)
                    .setFgColor(Color.WHITE)
                    .build();
                
            } else if (fields instanceof Refuge) {
                list[i] = new desktop_fields.Refuge.Builder()
                    .setTitle(field[i].fieldname)
                    .setDescription("You collect "+field[i].getRent()+"")
                    .setSubText("Bonus")
                    .setPicture("GUI/desktop_resources/pics/money.png")
                    .setBgColor(Color.GREEN)
                    .setFgColor(Color.BLACK)
                    .build();
                
            } else if (fields instanceof Labor) {
                list[i] = new Brewery.Builder()
                    .setTitle(field[i].fieldname)
                    .setDescription("Rent: 100xDices")
                    .setSubText("")
                    .setBgColor(Color.YELLOW)
                    .setFgColor(Color.BLACK)
                    .setRent("100xDices")
                    .setPicture(field[i].getName())
                    .build(); 
                
            } else if (fields instanceof Tax) {
                list[i] = new desktop_fields.Tax.Builder()
                    .setTitle(field[i].fieldname)
                    .setDescription("TAX: "+field[i].getRent()+"")
                    .setSubText("Pay "+field[i].getRent()+" in TAXES")
                    .setBgColor(Color.RED)
                    .build(); 
                
            } else if (fields instanceof Fleet) {
                list[i] = new Shipping.Builder()
                    .setTitle(field[i].fieldname)
                    .setDescription("Rent: 500-4000")
                    .setSubText("")
                    .setBgColor(Color.BLUE)
                    .setFgColor(Color.WHITE)
                    .setRent("500 per owned Fleet")
                    .build();
            }
        }
        GUI.create(list);
        return field;
    }
    
    /**
     * This method is used when a player lands on a field. landOnField defines what happens when a player lands on a field.
     * @param
     */
    public abstract void landOnField(Player player);  
    
    /**
     * Method returns the number of fields created.
     * @return numberOfFields
     */
    public static int getNumberOfFields() {
        return field.length;
    }
    /**
     * Method returns the name of the field.
     * @return fieldName
     */
    public String getName() {
        return fieldname;
    }
    
    public Field(String name) {
        this.fieldname = name;
    }
    
    /**
     * Method gets the rent of the field.
     * @return rentoffield
     */
    public abstract int getRent();
    
    /**
     * Method gets the price of the field.
     * @return Priceoffield
     */
    public abstract int getPrice();
    
    
}