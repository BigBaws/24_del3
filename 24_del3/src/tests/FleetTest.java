package tests;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import game.*;

public class FleetTest {
    private Player player1;
    private Player player2;
    private Fleet testfleet1;
    private Fleet testfleet2;
    private Fleet testfleet3;
    private Fleet testfleet4;
    
    Field[] fields = Field.createFields();
    
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
        int count = 0;
        
        while (count < 1) {
            for (Field f : fields) {
                if (f instanceof Fleet) {
                    Fleet fleet = (Fleet) f;
                    if (fleet.getStatus() == false) {
                        fleet.setOwner(player2);
                        fleet.setStatus(true);
                        count++;
                        break;
                    }
                }
            }
        }
        
        for (Field f : fields) {
            if (f instanceof Fleet) {
                Fleet fleet = (Fleet) f;
                if (fleet.getOwner() == player2) {
                    fleet.payRent(player1);
                    break;
                }
            }
        }
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
