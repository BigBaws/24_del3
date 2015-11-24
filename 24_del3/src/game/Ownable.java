package game;

import desktop_resources.GUI;

public abstract class Ownable extends Field {
    
public Ownable(String name) {
        super(name);
    }

    protected Player fieldowner;
    protected int fieldprice;
    protected boolean fieldowned;
    
    public abstract int getRent();
    
    /**
     * Bruges når en spiller lander på et felt der er ejet af en anden spiller.
     * @param player
     */
    public void payRent(Player player) {
        int payamount = getRent();
        player.payMoney(payamount);
        this.fieldowner.giveMoney(payamount);
        
        //ejerskab b�r defineres, evt. udnytte dele fra landsOnField().
    }
    

    
    /**
     * N�r spilleren �nsker at k�be et ledigt felt. Tager den aktuelle Player.
     * @param player
     */
    public void buyField(Player player){
        player.payMoney(fieldprice);
        fieldowned = true;
        fieldowner = player;
        GUI.setOwner(player.getPlayerPosition(), player.getName());
        GUI.setBalance(player.getName(), player.getMoney());
    }
    /**
     * N�r spilleren �nsker at s�lge et felt. Tager den aktuelle Player.
     * @param player
     * 
     */
    public void sellField(Player player) {
        player.giveMoney(fieldprice);
        fieldowned=false;
        // VI SKAL HAVE EN LISTE MED PLAYERENS FELTER!
    }
    
    @Override
    public void landOnField(Player player) {
        GUI.displayChanceCard("You have landed on "+fieldname+"");
        
        if (this.fieldowned){
            payRent(player);
            GUI.setBalance(player.getName(), player.getMoney());
            GUI.setBalance(this.fieldowner.getName(), this.fieldowner.getMoney());
        // Field is not owned    
        } else {
            
            if (player.getMoney() >= fieldprice) {
                GUI.getUserLeftButtonPressed("Buy "+fieldname+"?", "Buy", "Don't Buy");
                buyField(player);
            } else {
                GUI.getUserLeftButtonPressed("Sell Fields?", "Sell", "Don't Sell");
            }

        }
    }
    
    
    
}
