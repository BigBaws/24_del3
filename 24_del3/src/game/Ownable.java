package game;

public class Ownable extends Field{
	
	protected int price;
	protected String Player;
	protected int rent;
	protected boolean owned;
	public int getRent(){
		return rent;
		//ejerskab b�r defineres, evt. udnytte dele fra landsOnField().
	}
}
