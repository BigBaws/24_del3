package game;

public class Bank {
    
    private String name;
    private int gold;
    
    public Bank(String name) {
        this.name = name;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }
    
    public void addGold(int gold){
        this.gold += gold;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " " + gold;
    }
    
}