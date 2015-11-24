package game;

import desktop_resources.GUI;

public class Bank {
    
    private int money;
    
    /**
     * This is only used when a new player is created, and this function gives the player 30000
     */
    public Bank() {
        money = 30000; 
    }
    
    /**
     * This is how we fetch how much money a player has
     */
    public int getMoney() {
        return this.money;
    }
    
    /**
     * This is how you pay money to the bank
     * @param payamount
     */
    public void payMoney (int payamount) {
        int newbalance = (this.money - payamount);
        this.money = newbalance; 
    }
    

    /**
     * This is how we set a players money
     * @param newbalance
     */
    public void giveMoney (int newmoney) {
        this.money = (this.money + newmoney);
    }

}