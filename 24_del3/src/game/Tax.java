package game;

import desktop_resources.GUI;

public class Tax extends Field{
	private int taxAmount;
	private int taxRate=-1;
	private int specialFelt;
	
	public Tax(String name,int tax, int specialFelt){
	    super.name=name;
	    taxAmount=tax;
	    this.specialFelt = specialFelt;
	}
	public void landOnField(Player player){
	    if (specialFelt==0)
	    player.setScore(taxRate*taxAmount);
	    else{
	        Boolean choice;
	        choice=GUI.getUserLeftButtonPressed("Do you wish to pay 10% of total assets = "+player.gettotalassets()+"or pay "+taxAmount, "10% of assets", "Pay "+taxAmount);
	if (choice)
	player.setScore((player.gettotalassets()/10)*taxRate);
	else
	    player.setScore(taxRate*taxAmount);
	    }
}
}
