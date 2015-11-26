package game;

import desktop_resources.GUI;

public class Tax extends Field {
    protected String fieldname;
    private int taxAmount;
    
    public Tax(String name,int tax){
        super(name);
        taxAmount=tax;
    }
    
    @Override
    public void landOnField(Player player){
    	GUI.displayChanceCard("<center>"+player.getName()+" have landed on<br>"+fieldname+"<br><br>You paid "+taxAmount+".");
        player.payMoney(taxAmount);
        GUI.setBalance(player.getName(), player.getMoney());
    }

    @Override
    public int getRent() {
        return taxAmount;
    }

    @Override
    public String getName() {
        return this.fieldname;
    }

    @Override
    public int getPrice() {
        return 0;
    }

}
