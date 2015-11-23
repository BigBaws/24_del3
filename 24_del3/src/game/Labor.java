package game;

public class Labor extends Ownable {
private int baserent=100;
public Labor(String name){
    super.price=2500;
    super.name=name;
    super.owned=false;
}
//rente beregning kan blive gjort her, jeg er bare bange for at den bliver fast sat.
/**
 * Used when landing on an owned Labor camp.
 * @param dice
 * @return
 */
public int payRent(int dice){
    rent=baserent*dice;
    return rent;
}
@Override
public int getRent(){
    return baserent;
}
}
