package game;

public class Field {
    protected String name;
    protected Player[] players = new Player[6];
    /**
     * tilføjer spilleren til feltet. indtager spillerens navn.
     * @param player
     */
	public void landOnField(Player player) {
		switch (players.length){
		    case 0:
		        players[0]=player;
		    case 1:
		        players[1]=player;
		        break;
		    case 2:
                players[2]=player;
                break;
		    case 3:
                players[3]=player;
                break;
		    case 4:
                players[4]=player;
                break;
		    case 5:
                players[5]=player;
                break;
            default:
                System.out.print("FEJL");
                break;
		}
		
	}
}
