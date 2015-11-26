package tests;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import game.Player;
import game.Territory;

public class TerritoryTest {
    private Player player1;
    private Player player2;
    private Territory testTer;
    
    @Before
    public void setUp(){
player1= new Player("Lars");
player2= new Player("Svend");
testTer= new Territory("Black Cave", 1000, 4000);
    }
 
    @Test
    public void landon1owned() {
       int expected=player1.getMoney()-1000;
        testTer.buyField(player2);
        testTer.landOnField(player1);
        assertEquals(expected, player1.getMoney());
}
}