package game;

public class Territory extends Ownable {
    
    public Territory(String name, int fieldprice, int fieldrent){
        super.rent=fieldrent;
        super.price=fieldprice;
        super.owned=false;
        super.name=name;
    }
    @Override
    public int getRent(){
        return rent;
}
}
