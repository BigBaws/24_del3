package game;

import static org.junit.Assert.*;
import org.junit.Test;

public class FleetTest {
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
       int expected=player1.getMoney()-testfleet1.getRent();
        testfleet1.buyField(player2);
        
    }
    
}
