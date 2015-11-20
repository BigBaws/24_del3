package game;

import desktop_resources.GUI;

public abstract class Ownable extends Field{
	
	protected int price;
	protected Player player;
	protected int rent;
	protected boolean owned;
	
	/**
	 * Bruges n�r en spiller lander p� et felt der er ejet af en anden spiller.
	 * @param player
	 */
	public void payRent(Player player){
		player.setScore(rent);
		this.player.setScore(rent);
		//ejerskab b�r defineres, evt. udnytte dele fra landsOnField().
	}
	/**
	 * N�r spilleren �nsker at k�be et ledigt felt. Tager den aktuelle Player.
	 * @param player
	 */
	public void buyField(Player player){
	    player.setScore(-price);
	    this.player=player;
	    owned=true;
	}
	/**
	 * N�r spilleren �nsker at s�lge et felt. Tager den aktuelle Player.
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
	      //f.eks. at kunne s�lge et felt for at f� r�d til det nye
	      if(GUI.getUserLeftButtonPressed("Buy "+name+"?", "Buy", "Don't Buy")){
	          buyField(player);
	          //else statement der slutter tur?
	      }
	      }
	  }
    public int getPrice() {
            return price;
        }
    public void setPrice(int price) {
            this.price = price;
        }
    public Player getPlayer() {
            return player;
        }
    public void setPlayer(Player player) {
            this.player = player;
        }
    public int getRent() {
            return rent;
        }
    public void setRent(int rent) {
            this.rent = rent;
        }
    public boolean isOwned() {
            return owned;
        }
    public void setOwned(boolean owned) {
            this.owned = owned;
        }
}
