package game;

public class Ownable extends Field{
	
	protected int price;
	protected Player player;
	protected int rent;
	protected boolean owned;
	
	/**
	 * Bruges når en spiller lander på et felt der er ejet af en anden spiller.
	 * @param player
	 */
	public void payRent(Player player){
		player.setScore(rent);
		this.player.setScore(rent);
		//ejerskab bør defineres, evt. udnytte dele fra landsOnField().
	}
	/**
	 * Når spilleren ønsker at købe et ledigt felt. Tager den aktuelle Player.
	 * @param player
	 */
	public void buyField(Player player){
	    player.setScore(-price);
	    this.player=player;
	    owned=true;
	}
	/**
	 * Når spilleren ønsker at sælge et felt. Tager den aktuelle Player.
	 * @param player
	 */
	public void sellField(Player player){
	    player.setScore(price);
	    this.player=null;
	    owned=false;
	}
	//@override
	public void landOnField(Player player){
	  if (owned=true){
	      super.payRent(player);
	  }
	  else{
	      
	      }
	  }
}
