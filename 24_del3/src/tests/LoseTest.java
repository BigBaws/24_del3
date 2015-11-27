package tests;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import game.Player;

public class LoseTest {  
    private Player player1;
    
    @Before
    public void setUp(){
        player1= new Player("Lars");
    }
    
    @Test
    public void playerlose() {
        boolean expected=true;        
        player1.payMoney(30001);
        assertEquals(expected, player1.bankrupt());
    }
}
