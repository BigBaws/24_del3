package game;

//alle klasser der arver herfra b�r benytte players istedet for navnet p� spilleren,
//p� den m�de kan felter udveksle data og placering.
//(selve br�ttet, med felternes placering kan defineres korrekt n�r felterne fungere)
public class Field {
    protected String name;
    protected Player[] players = new Player[6];
    /**
     * tilf�jer spilleren til feltet. indtager spillerens navn.
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
		// funktion til at fjerne spiller og s�tte arrayet til
		//at fylde de lavest nummererede pladser f�rst skal tilf�jes p� smart vis.
		//evt. fjerne spiller inden han lander p� et felt i landsOnField()
		
	}
}
