package game;

/**
 * Dice - Terninger
 * @author Gruppe 24
 * @version 12/11-15
 **/

public class Dice {
    private int value1, value2;
    
    /**
     * Creating the dices and calling the roll() method, to set dices value to a random,
     * even though they arent used yet.
     */
    public Dice(){
        roll();
    }
    
    /**
     * roll() method is generating two random numbers [1-6]
     * and setting a new value1 and value2
     */
    public void roll(){
        value1 = (int)(Math.random()*6)+1;
        value2 = (int)(Math.random()*6)+1;
    }
    
    /**
     * This will return the number stored in value1
     * @return int value1
     */
    public int getDice1() {
        return value1;
    }
    
    /**
     * This will return the number stored in value2
     * @return int value2
     */
    public int getDice2() {
        return value2;
    }
    
    /**
     * The method getSum() is returning the sum of value1 and value2
     * @return value1 + value2
     */
    public int getSum(){
        return value1 + value2;
    }
    
}
