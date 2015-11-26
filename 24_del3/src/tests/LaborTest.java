package tests;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import game.Player;
import game.Labor;
import game.Dice;


public class LaborTest {
    private Player player1;
    private Player player2;
    private Labor testcamp;
    private Dice dice;
    
    @Before
    public void setUp(){
player1= new Player("Lars");
player2= new Player("Svend");
testcamp= new Labor("Camp");
dice= new Dice();

    }
    
    @Test
    public void landon1owned() {
       int expected=player1.getMoney()-100*dice.getSum();
       testcamp.buyField(player2);
       testcamp.landOnField(player1);
        assertEquals(expected, player1.getMoney());
    }
    
}
