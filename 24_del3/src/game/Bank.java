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
   * This method returns the amount of money the player is in possession of
   * @return int money
   */
    public int getMoney() {
        return this.money;
    }
    
    /**
     * This method is used to decrease the amount of money the player possess
     * @param int payamount
     */
    public void payMoney (int payamount) {
        int newbalance = (this.money - payamount);
        this.money = newbalance; 
    }
    

    /**
     * This method increases the amount of money the player possess
     * @param int newbalance
     */
    public void giveMoney (int newmoney) {
        this.money = (this.money + newmoney);
    }

}