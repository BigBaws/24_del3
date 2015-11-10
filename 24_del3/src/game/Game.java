package game;

import desktop_resources.GUI;

public class Game {

	private static Fields[] list;
	private static Dice[] dice = { new Dice(), new Dice() };
	
	public static void main(String[] args) {
		new Game();
	}
	
	public Game() {
		// Create Fields
        Field Field = new Field();
		
        // How many Players?
        int NumberofPlayers = GUI.getUserSelection("", "2 Players", "3 Players", "4 Players", "5 Players", "6 Players");
        
        // Create Player 1,2,3,4,5,6
        Player Player1 = new Player();
        Player Player2 = new Player();
        Player Player3 = new Player();
        Player Player4 = new Player();
        Player Player5 = new Player();
        Player Player6 = new Player();
        
        // Create Players Bank with start Money
        Bank Player1Bank = new Bank(Player1.PlayerName);
        Bank Player2Bank = new Bank(Player2.PlayerName);
        Bank Player3Bank = new Bank(Player3.PlayerName);
        Bank Player4Bank = new Bank(Player4.PlayerName);
        Bank Player5Bank = new Bank(Player5.PlayerName);
        Bank Player6Bank = new Bank(Player6.PlayerName);
	}

}
