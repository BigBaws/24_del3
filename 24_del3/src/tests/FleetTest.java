package tests;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import game.*;

public class FleetTest {
    private Player player1;
    private Player player2;

    
    Field[] fields = Field.createFields();
    
    @Before
    public void setUp(){
        
        player1= new Player("Lars");
        player2= new Player("Svend");
        player1.movePlayer(player1, 1);
        player2.movePlayer(player2, 1);
        
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
                        fleet.buyField(player2);
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
        int count = 0;
        
        while (count < 2) {
            for (Field f : fields) {
                if (f instanceof Fleet) {
                    Fleet fleet = (Fleet) f;
                    if (fleet.getStatus() == false) {
                        fleet.buyField(player2);
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
    public void landon3owned() {
        int expected=player1.getMoney()-2000;
        int count = 0;
        
        while (count < 3) {
            for (Field f : fields) {
                if (f instanceof Fleet) {
                    Fleet fleet = (Fleet) f;
                    if (fleet.getStatus() == false) {
                        fleet.buyField(player2);
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
}
