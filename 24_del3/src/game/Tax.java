package game;

public class Tax extends Field{
	private int taxAmount;
	private int taxRate=-1;
	
	public Tax(String name,int tax){
	    super.name=name;
	    taxAmount=tax;
	}
	public void landOnField(Player player){
	    player.setScore(taxRate*taxAmount);
	}
}
