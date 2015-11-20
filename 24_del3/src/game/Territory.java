package game;

import desktop_resources.GUI;

public class Territory extends Ownable {
    
    public Territory(String name, int fieldprice, int fieldrent){
        super.rent=fieldrent;
        super.price=fieldprice;
        super.owned=false;
        super.name=name;
    }
    
}

