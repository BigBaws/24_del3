package game;

public class Refuge extends Field{
private int bonus;
public Refuge(String name, int bonus){
    super.name=name;
    this.bonus=bonus;
}
public void landOnField(Player player){
player.setScore(bonus);    
}

}
