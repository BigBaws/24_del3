package game;

import desktop_resources.GUI;

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
	      payRent(player);
	  }
	  else{
	      //evt. restrukturering for at give bredere mulighed, 
	      //f.eks. at kunne sælge et felt for at få råd til det nye
	      if(GUI.getUserLeftButtonPressed("Buy "+name+"?", "Buy", "Don't Buy")){
	          buyField(player);
	          //else statement der slutter tur?
	      }
	      }
	  }
}
