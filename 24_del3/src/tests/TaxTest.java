package tests;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import game.Player;
import game.Tax;

public class TaxTest {
    private Player player1;
    private Tax testTax;
    
    @Before
    public void setUp(){
        player1= new Player("Lars");
        testTax= new Tax("Skat", 2000, "false");
        
    }
    @Test
    public void landon1owned() {
        int expected=player1.getMoney()-2000;
        int tax = testTax.getRent();
        player1.giveMoney(-tax);
        assertEquals(expected, player1.getMoney());
    }
}
