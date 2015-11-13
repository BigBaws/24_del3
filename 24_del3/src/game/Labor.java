package game;

public class Labor extends Ownable {
private int baserent;
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
public int payrent(int dice){
    rent=100*dice;
    return rent;
}
}
