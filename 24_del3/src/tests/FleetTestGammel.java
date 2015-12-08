package tests;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import game.*;

public class FleetTestGammel {
    private Player player1;
    private Player player2;
    private Fleet testfleet1;
    private Fleet testfleet2;
    private Fleet testfleet3;
    private Fleet testfleet4;
    
    @Before
    public void setUp(){
        player1= new Player("Lars");
        player2= new Player("Svend");
        testfleet1= new Fleet("Dåsen");
        testfleet2= new Fleet("Fisken");
        testfleet3= new Fleet("Hajen");
        testfleet4= new Fleet("Fruen");
        
    }
    
    @Test
    public void landon1owned() {
        int expected=player1.getMoney()-500;
        testfleet1.setStatus(true);
        testfleet1.setOwner(player2);
        testfleet1.payRent(player1);
        assertEquals(expected, player1.getMoney());
        
    }
    @Test
    public void landonmultipleownedfleets() {
        int expected=player1.getMoney()-2000;
        testfleet1.setStatus(true);
        testfleet1.setOwner(player2);       
        testfleet2.setStatus(true);
        testfleet2.setOwner(player2);
        
        testfleet1.payRent(player1);
        testfleet2.payRent(player1);
        assertEquals(expected, player1.getMoney());
    }
    @Test
    public void landon3owned() {
        int expected=player1.getMoney()-2000;
        testfleet1.setStatus(true);
        testfleet1.setOwner(player2);       
        testfleet2.setStatus(true);
        testfleet2.setOwner(player2);
        testfleet3.setStatus(true);
        testfleet3.setOwner(player2);       

        testfleet1.payRent(player1);
        assertEquals(expected, player1.getMoney());
    }
}
