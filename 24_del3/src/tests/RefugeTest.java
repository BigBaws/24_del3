package tests;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import game.Player;
import game.Refuge;

public class RefugeTest {  
    private Player player1;
    private Player player2;
    private Refuge testRefuge;
    
    @Before
    public void setUp(){
        player1= new Player("Lars");
        player2= new Player("Svend");
        testRefuge= new Refuge("Fuge",500);    
        
    }
    @Test
    public void landon1owned() {
        int expected=player1.getMoney()+500;
        testRefuge.getRent();
        player1.giveMoney(testRefuge.getRent());
        assertEquals(expected, player1.getMoney());
    }
}
