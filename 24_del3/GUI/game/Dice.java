package game;

/**
 * Dice - Terninger
 * @author Gruppe 24
 * @version 24/10-15
 **/

public class Dice {
    private int value1, value2;
    
    // Vi kaster terningerne så de har en værdi
    public Dice(){
        roll();
    }
    
    public void roll(){
        value1 = (int)(Math.random()*6)+1;
        value2 = (int)(Math.random()*6)+1;
    }
    
    public int getfirst() {
        return value1;
    }
    public int getsecond() {
        return value2;
    }
    
    public int getSum(){
        return value1 + value2;
    }
    
    public boolean is10(){
        return value1 + value2 == 10;
    }   
    
}
