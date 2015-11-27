package tests;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import desktop_resources.GUI;
import game.*;

public class TerritoryTest {
    private Player player1;
    private Player player2;
    private Territory testTer;
    
    @Before
    public void setUp()  throws Exception{
        player1= new Player("Lars");
        player2= new Player("Svend");
        testTer= new Territory("Black Cave", 1000, 4000);

    }
    @After
    public void tearDown()  throws Exception{
        player1= new Player("Lars");
        player2= new Player("Svend");
        testTer= new Territory("Black Cave", 1000, 4000);    
    }
    
    @Test
    public void landon1owned(){
        int expected=player1.getMoney()-1000;
        testTer.setStatus(true);
        testTer.setOwner(player2);
        testTer.payRent(player1);
        assertEquals(expected, player1.getMoney());
    }
}