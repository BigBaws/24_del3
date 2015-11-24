package game;

import desktop_resources.GUI;

public class Game {


	private static Dice[] dice = { new Dice(), new Dice() };
	
	public static void main(String[] args) {
		new Game();
	}
	
	public Game() {
		// Create Fields, Both GUI and game logic fields.
        Fields Field = new Fields();
		
        // How many Players?
        String numberOfPlayers = GUI.getUserSelection("How many players wish to participate?", "2 Players", "3 Players", "4 Players", "5 Players", "6 Players");
        
        // Create Player 1,2,3,4,5,6
        switch(numberOfPlayers){
            case "6 Players":
                String playerinput;
              playerinput= GUI.getUserString("Player 6 type your name");
                Player Player6 = new Player(playerinput);
            case "5 Players":
                playerinput= GUI.getUserString("Player 5 type your name");
                Player Player5 = new Player(playerinput);
            case "4 Players":
                playerinput= GUI.getUserString("Player 4 type your name");
                Player Player4 = new Player(playerinput);
            case "3 Players":
                playerinput= GUI.getUserString("Player 3 type your name");
                Player Player3 = new Player(playerinput);
            case "2 Players":
                playerinput= GUI.getUserString("Player 2 type your name");
                Player Player2 = new Player(playerinput);
                playerinput= GUI.getUserString("Player 1 type your name");
                Player Player1 = new Player(playerinput);
                // beskriv en tur i en metode. lav while loop der kører indtil der kun er en spiller.
                // lav en lose metode der fjerner spilleren.
        }
 
        }
        
        
        
        
        
        

	}

