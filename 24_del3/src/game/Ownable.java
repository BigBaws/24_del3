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
        player.setAssets(fieldprice);
        fieldowned = true;
        fieldowner = player;
        GUI.setOwner(player.getPlayerPosition(), player.getName());
        GUI.setBalance(player.getName(), player.getMoney());
    }
    
    
    @Override
    public void landOnField(Player player) {
        
        if (this.fieldowned){
            
            if (player == fieldowner) {
                GUI.displayChanceCard("<center>"+player.getName()+" have landed on<br>"+fieldname+"<br><br>This field is your own field.");
            } else if (this.getRent() < player.getMoney()) {
                payRent(player);
                GUI.setBalance(player.getName(), player.getMoney());
                GUI.setBalance(this.fieldowner.getName(), this.fieldowner.getMoney());
                GUI.displayChanceCard("<center>"+player.getName()+" have landed on<br>"+fieldname+"<br><br>This field is owned by:<br>"+fieldowner.getName()+"<br><br>You paid   "+field[player.getPlayerPosition()-1].getRent()+"   in rent");
            } else if (this.getRent() > player.getMoney()) {
                boolean boo = GUI.getUserLeftButtonPressed(""+player.getName()+"", "Sell all fields", "Go Bankrupt");
                if (boo) {
                    sellAllFields(player);
                    payRent(player);
                    GUI.setBalance(player.getName(), player.getMoney());
                    GUI.setBalance(this.fieldowner.getName(), this.fieldowner.getMoney());
                } else {
                    sellAllFields(player);
                    payRent(player);
                    player.payMoney(player.getMoney()+1);
                    GUI.setBalance(player.getName(), player.getMoney());
                    GUI.setBalance(this.fieldowner.getName(), this.fieldowner.getMoney());
                }
                
            }
            
            
        } else {
            GUI.displayChanceCard("<center>"+player.getName()+" have landed on<br>"+fieldname+"<br><br>you can buy this field for <br>"+fieldprice+"");
            
            if (player.getMoney() >= fieldprice) {
                boolean foo = GUI.getUserLeftButtonPressed(""+player.getName()+"", "Buy "+fieldname+" for "+fieldprice+"", "Don't Buy");
                if (foo) {
                    buyField(player);
                }
                
            } else {
                boolean boo = GUI.getUserLeftButtonPressed(""+player.getName()+"", "Sell all fields", "Go Bankrupt");
                if (boo) {
                    sellAllFields(player);
                } else {
                    sellAllFields(player);
                    player.payMoney(player.getMoney()+1);
                    GUI.setBalance(player.getName(), player.getMoney());
                }
            }
            
        }
    }
    
    public void setStatus(boolean boo) {
        fieldowned = boo;
    }
    
    public boolean getStatus() {
        return fieldowned;
    }
    
    public void setOwner(Player player) {
        fieldowner = player;
    }
    
    public Player getOwner() {
        return fieldowner;
    }
    
}
