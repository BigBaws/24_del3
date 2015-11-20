package game;

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
	    player.setScore(taxRate*taxAmount);
	}
}
