package game;

import desktop_codebehind.Car;
import desktop_resources.GUI;

public class Player {
   
    String PlayerName;
    
    public Player() {
        GUI.displayChanceCard("------- Greetings Traveler -------- <br><br> You're standing infront of a Wizard and he wants to know your name. <br><br> So what should we call you?");
        String name = GUI.getUserString("");
        GUI.displayChanceCard("The Wizard mumbles while he smokes his pipe. <br><br> Suddenly there is a thick fog all around you and you have a deep desire to choose your inner animal. <br><br> Choose you animal");
        String character = GUI.getUserSelection("", "Goat", "Pig", "Penguin", "Sheep");
        
        PlayerName = name;
        

        Car.Builder builder = new Car.Builder();

        switch (character) {
        default:
        case "Goat":
            builder.typeCar(); break;
        case "Pig":
            builder.typeRacecar(); break;
        case "Penguin":
            builder.typeTractor(); break;
        case "Sheep":
            builder.typeUfo(); break;
        }

        Car car = builder.build();
        GUI.addPlayer(name, 1000, car);
    }

}
