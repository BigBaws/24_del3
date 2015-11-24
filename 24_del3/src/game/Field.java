package game;

//alle klasser der arver herfra b�r benytte players istedet for navnet p� spilleren,
//p� den m�de kan felter udveksle data og placering.
//(selve br�ttet, med felternes placering kan defineres korrekt n�r felterne fungere)
public abstract class Field {
protected String name;
protected boolean turn=true;
    /**
     * Benyttes n�r en spiler lander p� et felt.
     * @param player
     */
	public abstract void landOnField(Player player);
	/**
	 * returnere feltets navn
	 * @return
	 */
	public String getName(){
	    return name;
	}

	}