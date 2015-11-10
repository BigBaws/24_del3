package game;

import desktop_resources.GUI;

public class Game {
    
	public static void main(String[] args) {
		new Game();
	}
	
	public Game() {
	    
// PRE-Game Setup
        Fields Field = new Fields();
        //Printer Printer = new Printer();
        Dice Dice = new Dice();
        
        // Create player 1 & 2
        Player Player1 = new Player();
        Player Player2 = new Player();
        
        // Create a Player Bank with start Gold
        Bank P1Bank = new Bank(Player1.PlayerName);
        Bank P2Bank = new Bank(Player2.PlayerName);
        P1Bank.addGold(1000);
        P2Bank.addGold(1000);
        
        // Set cars on the board
        GUI.setCar(1, Player1.PlayerName);
        GUI.setCar(31, Player2.PlayerName);
        
        // Player1 turn = 1 || Player2 turn = 2
        int turn = 0;
// END PRE-Game Setup        
        
        turn = 1;
        
        
        // Game loop
        while (turn > 0) {
            
            // We check if somebody wins
            while (turn == 3) {
                // Both players win
                if (P1Bank.getGold() >= 1200 && P2Bank.getGold() >= 3000) {
                    GUI.displayChanceCard("You both win </html>");
                    break;
                }
                // Player 1 wins
                if (P1Bank.getGold() >= 1200) {
                    GUI.displayChanceCard("<br>You win " +Player1.PlayerName+ "</html>");
                    GUI.getUserButtonPressed("The End", "OK");
                    System.exit(0);
                    break;
                }
                // Player 2 wins
                if (P2Bank.getGold() >= 1200) {
                    GUI.displayChanceCard("<br>You win " +Player2.PlayerName+ "</html>");
                    GUI.getUserButtonPressed("The End", "OK");
                    System.exit(0);
                    break;
                }
                turn = 1;
            }
            
            // Player 1
            while (turn == 1) {
                // Reset the Car
                GUI.removeAllCars(Player1.PlayerName);
                GUI.setCar(1, Player1.PlayerName);
                GUI.displayChanceCard();
	        
                // Player 1 rolls
                GUI.getUserButtonPressed("", Player1.PlayerName+": Roll Dices");
                Dice.roll();
                GUI.setDice(Dice.getfirst(), Dice.getsecond());
                
                // Player 1 move car
                GUI.removeAllCars(Player1.PlayerName);
                GUI.setCar(Dice.getSum(), Player1.PlayerName);
                GUI.displayChanceCard();
                
                // Add gold to bank from the fields gold value
                P1Bank.addGold(Field.getFieldValue(Dice.getSum()));
                GUI.setBalance(Player1.PlayerName, P1Bank.getGold());
                
                // Display text from the field
                GUI.displayChanceCard(Field.getFieldText(Dice.getSum()));
                
                if (Dice.getSum() == 10) {
                    
                } else {
                    // Let the next player get his turn
//                    GUI.getUserButtonPressed("", Player1.PlayerName+" End turn");
                    turn++;
                }
            }
            
            // Player 2
            while (turn == 2) {
                // Reset the Car
                GUI.removeAllCars(Player2.PlayerName);
                GUI.setCar(31, Player2.PlayerName);
                GUI.displayChanceCard();
                
                // Player 1 rolls
                GUI.getUserButtonPressed("", Player2.PlayerName+": Roll Dices");
                Dice.roll();
                GUI.setDice(Dice.getfirst(), Dice.getsecond());
                
                // Player 1 move car
                GUI.removeAllCars(Player2.PlayerName);
                GUI.setCar(32-Dice.getSum(), Player2.PlayerName);  
                GUI.displayChanceCard();
                
                // Add gold to bank from the fields gold value
                P2Bank.addGold(Field.getFieldValue(Dice.getSum()));
                GUI.setBalance(Player2.PlayerName, P2Bank.getGold());
                
                // Display text from the field
                GUI.displayChanceCard(Field.getFieldText(Dice.getSum()));
                
                if (Dice.getSum() == 10) {
                    
                } else {
                    // Let the next player get his turn
                    //GUI.getUserButtonPressed("", Player2.PlayerName+" End turn");
                    turn++;
                }
                
            }
            
            
        } // Game loop ends
	    
	}
}