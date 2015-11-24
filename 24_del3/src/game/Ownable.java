package game;

import desktop_resources.GUI;

public abstract class Ownable extends Field{
	
	protected int price;
	protected Player player;
	protected int rent;
	protected boolean owned;
	
	
	/**
	 * Bruges naar en spiller lander paa et felt der er ejet af en anden spiller.
	 * @param player
	 */
	
	public void payRent(Player player){
		player.setScore(-rent);
		this.player.setScore(rent);
		//ejerskab bï¿½r defineres, evt. udnytte dele fra landsOnField().
	}
	/**
	 * Naar spilleren oensker at koebe et ledigt felt. Tager den aktuelle Player.
	 * @param player
	 */
	
	public void buyField(Player player){
	    player.setScore(-price);
	    this.player=player;
	    player.setOwnedvalue(price);
	    player.setOwned(this);
	    owned=true;
	}
	/**
	 * Naar spilleren oensker at saelge et felt. Tager den aktuelle Player.
	 * @param player
	 */
	
//	public void sellField(Player player){
//	    player.setScore(price);
//	    this.player=null;
//	    player.setOwnedvalue(-price);
//	    owned=false;
//	}
	@Override
	public void landOnField(Player player){
	    turn=true;
	  if (owned=true){
	      if (this.player!=player)
	      payRent(player);
	      String choice=GUI.getUserSelection("What do you wish to do?", "2. Sell fields" , "3. End turn");
          switch(choice){ 
          case "2. Sell fields":
              //evt. tilføj måde så spiller ikke kan sælge hvis han ikke ejer noget.
             boolean sell=true;
              while(sell){
                  player.sellfields();
                  sell=GUI.getUserLeftButtonPressed("Do you wish to sell more? ", "Continue selling", "Done selling");
              }
          case "3. End turn":
              turn=false;
              break;
	  }
	  }
	  else{
	      //evt. restrukturering for at give bredere mulighed, 
	    //f.eks. at kunne saelge et felt for at faa raad til det nye
	      while (turn){
	     String choice=GUI.getUserSelection("What do you wish to do?", "1. Buy ", "2. Sell fields" , "3. End turn");
	         switch(choice){ 
	         case "1. Buy ":
	             buyField(player);
	         case "2. Sell fields":
	            boolean sell=true;
	             while(sell){
	                 player.sellfields();
	                 sell=GUI.getUserLeftButtonPressed("Do you wish to sell more? ", "Continue selling", "Done selling");
	             }
	         case "3. End turn":
	             turn=false;
	             break;
	          //else statement der slutter tur?
	      }
	      }
	      }
	  }
	/**
	 * tilbagegiver prisen på feltet
	 * @return
	 */
    public int getPrice() {
            return price;
        }
    /**
     * aedre prisen på feltet, tager den nye pris.
     * @param price
     */
	    public void setPrice(int price) {
            this.price = price;
        }
    /**
     * henter spillernavnet af ejeren af feltet.
     * @return
     */
	
    public Player getPlayer() {
            return player;
        }
    /**
     * tilbagegiver renten på feltet.
     * @return
     */
    public abstract int getRent();
    /**
     * tilbagegiver ejerskabs statusen (ejet eller ej)
     * @return
     */

    public boolean isOwned() {
            return owned;
        }

}
