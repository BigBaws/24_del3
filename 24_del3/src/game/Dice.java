package game;

public class Dice 
	{
    /**
     * terningen aendres til en ny tilfaeldig vaerdi, returnere vaerdien af terningen.
     * @return
     */
		public int roll()
		{
			int resultat = ((int) (Math.random()*6)+1);
			return resultat;
			
		}
		
	}


