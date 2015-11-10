package game;

import java.awt.Color;
import desktop_fields.Empty;
import desktop_fields.Field;
import desktop_fields.Shipping;
import desktop_fields.Start;
import desktop_resources.GUI;

public class Fields {
    
    int fieldvalue;
    String fieldtext;
		
		public Fields() {
			Field[] fields = new Field[31];    
			fields[0] = new Start.Builder()
					.setTitle("Player 1")
					.setDescription("Start")
					.setSubText(" ")
					.setBgColor(Color.GREEN)
					.build();
			
			fields[1] = new Shipping.Builder()
					.setTitle("Tower")
					.setDescription("Tower")
					.setSubText("+250")
					.setPicture("images/tower.png")
					.setBgColor(Color.YELLOW)
					.setFgColor(Color.RED)
	                .setRent("250")
					.build();	
			fields[2] = new Shipping.Builder()
					.setTitle("Crater")
					.setDescription("Crater")
					.setSubText("-100")
	                .setPicture("images/crater.png")
					.setBgColor(Color.RED)
	                .setRent("-100")
					.build();	
			fields[3] = new Shipping.Builder()
					.setTitle("Palace Gates")
					.setDescription("Palace Gates")
					.setSubText("+100")
					.setPicture("images/palacegates.png")
					.setBgColor(Color.YELLOW)
					.setRent("100")
					.build();	
			fields[4] = new Shipping.Builder()
					.setTitle("Cold Desert")
					.setDescription("Cold Desert")
					.setSubText("-20")
					.setPicture("images/colddesert.png")
					.setBgColor(Color.RED)
					.setRent("-20")
					.build();	
			fields[5] = new Shipping.Builder()
					.setTitle("Walled City")
					.setDescription("Walled City")
					.setSubText("+180")
					.setBgColor(Color.YELLOW)
					.setPicture("images/walledcity.png")
					.setRent("180")
					.build();	
			fields[6] = new Shipping.Builder()
					.setTitle("Monastery")
					.setDescription("Monastery")
					.setSubText("0")
					.setBgColor(Color.GREEN)
					.setPicture("images/monastery.png")
					.setRent("0")
					.build();	
			fields[7] = new Shipping.Builder()
					.setTitle("Black Cave")
					.setDescription("Black Cave")
					.setSubText("-70")
					.setBgColor(Color.RED)
					.setPicture("images/blackcave.png")
					.setRent("-70")
					.build();	
			fields[8] = new Shipping.Builder()
					.setTitle("Mountains")
					.setDescription("Huts in the mountains")
					.setSubText("+60")
					.setBgColor(Color.YELLOW)
					.setPicture("images/huts.png")
					.setRent("60")
					.build();	
			fields[9] = new Shipping.Builder()
					.setTitle("Wolf Wall")
					.setDescription("Werewolf Wall")
					.setSubText("-80")
					.setBgColor(Color.RED)
					.setPicture("images/werewolfwall.png")
					.setRent("-80")
					.build();
			fields[10] = new Shipping.Builder()
					.setTitle("The Pit")
					.setDescription("The Pit")
					.setSubText("-50")
					.setBgColor(Color.RED)
					.setPicture("images/thepit.png")
					.setRent("-50")
					.build();	
			fields[11] = new Shipping.Builder()
					.setTitle("Goldmine")
					.setDescription("Goldmine")
					.setSubText("+650")
					.setBgColor(Color.YELLOW)
					.setPicture("images/goldmine.png")
					.setRent("650")
					.setFgColor(Color.RED)
					.build();	
			fields[12] = new Empty.Builder()
					.build();
			fields[13] = new Empty.Builder()
					.build();	
			fields[14] = new Empty.Builder()
					.build();	
			fields[15] = new Empty.Builder()
					.build();	
			fields[16] = new Empty.Builder()
					.build();	
			fields[17] = new Empty.Builder()
					.build();	
			fields[18] = new Empty.Builder()
					.build();
            fields[19] = new Shipping.Builder()
                .setTitle("Goldmine")
                .setDescription("Goldmine")
                .setSubText("+650")
                .setBgColor(Color.YELLOW)
                .setPicture("images/goldmine.png")
                .setRent("650")
                .setFgColor(Color.RED)
                .build();   
            fields[20] = new Shipping.Builder()
                .setTitle("The Pit")
                .setDescription("The Pit")
                .setSubText("-50")
                .setBgColor(Color.RED)
                .setPicture("images/thepit.png")
                .setRent("-50")
                .build(); 
            fields[21] = new Shipping.Builder()
                .setTitle("Wolf Wall")
                .setDescription("Werewolf Wall")
                .setSubText("-80")
                .setBgColor(Color.RED)
                .setPicture("images/werewolfwall.png")
                .setRent("-80")
                .build();
            fields[22] = new Shipping.Builder()
                .setTitle("Mountains")
                .setDescription("Huts in the mountains")
                .setSubText("+60")
                .setBgColor(Color.YELLOW)
                .setPicture("images/huts.png")
                .setRent("60")
                .build();
            fields[23] = new Shipping.Builder()
                .setTitle("Black Cave")
                .setDescription("Black Cave")
                .setSubText("-70")
                .setBgColor(Color.RED)
                .setPicture("images/blackcave.png")
                .setRent("-70")
                .build(); 
            fields[24] = new Shipping.Builder()
                .setTitle("Monastery")
                .setDescription("Monastery")
                .setSubText("0")
                .setBgColor(Color.GREEN)
                .setPicture("images/monastery.png")
                .setRent("0")
                .build();
            fields[25] = new Shipping.Builder()
                .setTitle("Walled City")
                .setDescription("Walled City")
                .setSubText("+180")
                .setBgColor(Color.YELLOW)
                .setPicture("images/walledcity.png")
                .setRent("180")
                .build();
            fields[26] = new Shipping.Builder()
                .setTitle("Cold Desert")
                .setDescription("Cold Desert")
                .setSubText("-20")
                .setPicture("images/colddesert.png")
                .setBgColor(Color.RED)
                .setRent("-20")
                .build(); 
            fields[27] = new Shipping.Builder()
                .setTitle("Palace Gates")
                .setDescription("Palace Gates")
                .setSubText("+100")
                .setPicture("images/palacegates.png")
                .setBgColor(Color.YELLOW)
                .setRent("100")
                .build();
            fields[28] = new Shipping.Builder()
                .setTitle("Crater")
                .setDescription("Crater")
                .setSubText("-100")
                .setPicture("images/crater.png")
                .setBgColor(Color.RED)
                .setRent("-100")
                .build();  
            fields[29] = new Shipping.Builder()
                .setTitle("Tower")
                .setDescription("Tower")
                .setSubText("+250")
                .setPicture("images/tower.png")
                .setBgColor(Color.YELLOW)
                .setFgColor(Color.RED)
                .setRent("250")
                .build();   	
            fields[30] = new Start.Builder()
                .setTitle("Player 2")
                .setDescription("Start")
                .setSubText(" ")
                .setBgColor(Color.GREEN)
                .build();
			
			GUI.create(fields);
		}
		
		public int getFieldValue(int sum) {
		    if (sum == 2) {
		        fieldvalue = 250;
		    } else if (sum == 3) {
		        fieldvalue = -100;
		    } else if (sum == 4) {
		        fieldvalue = 100;
            } else if (sum == 5) {
                fieldvalue = -20;
            } else if (sum == 6) {
                fieldvalue = 180;
            } else if (sum == 7) {
                fieldvalue = 0;
            } else if (sum == 8) {
                fieldvalue = -70;
            } else if (sum == 9) {
                fieldvalue = 60;
            } else if (sum == 10) {
                fieldvalue = -80;
            } else if (sum == 11) {
                fieldvalue = -50;
            } else if (sum == 12) {
                fieldvalue = 650;
            }
		    
		    return fieldvalue;
		}
		
	      public String getFieldText(int field) {
	            if (field == 2) {
	                fieldtext = "You have reached the tower belonging to some friends, they bring you " +fieldvalue+ ".";
	            } else if (field == 3) {
	                fieldtext = "You have fallen into a crater, it will cost you " +fieldvalue+ ".";
	            } else if (field == 4) {
	                fieldtext = "The sultan in the palace greets you welcome, and gives you " +fieldvalue+ ".";
	            } else if (field == 5) {
	                fieldtext = "Traveling in the cold desert was a mistake, you sell one of your sister and give a symbolic " +fieldvalue+ " coins to buy a camel and get out of there.";
	            } else if (field == 6) {
	                fieldtext = "You reached the Walled City and decided to rob their turist atraction. This gives you " +fieldvalue+ " coins.";
	            } else if (field == 7) {
	                fieldtext = "You passed the monastery or so you think. The monks wants you to pray with them in their monastery. Nothing Happens!";
	            } else if (field == 8) {
	                fieldtext = "The Black Cave is not a friendly place, you loose " +fieldvalue+ " coins.";
	            } else if (field == 9) {
	                fieldtext = "You have travelled far up in the mountains, where you decide to rob a poor tribe for " +fieldvalue+ "coins.";
	            } else if (field == 10) {
	                fieldtext = "YOU GET AN EXTRA TURN! <br><br> The Werewolf wall is a nasty place, so pay " +fieldvalue+ " coins.";
	            } else if (field == 11) {
	                fieldtext = "You have fallen into a pit. Now a ladder costs " +fieldvalue+ " and you decided to buy one.";
	            } else if (field == 12) {
	                fieldtext = "WAUW, you strike gold. This gold nugget will bring you " +fieldvalue+ " coins.";
	            }
	            
	            return fieldtext;
	        }
	      
}