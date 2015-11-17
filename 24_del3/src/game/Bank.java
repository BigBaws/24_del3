package game;

// Banken skal holde på ejendomme, alt omkring ejendomme skal foregå internt i banken.
// Der skal laves en metode som der kan trække penge, sætte penge ind på anden konto og som der deler ejendommene ud.

public class Bank{
    
    private int score;
    
    public Bank(){
        
            score = 30000;      
        }
    
        public int getscore(){
            return score;
        }
        
        public void setscore (int score){
            this.score = score;
        }
        
        
//        String[] player;
//        
//        player = new String[6];
//        
//        player[0] = "player1";
//        player[1] = "player2";
//        player[2] = "player3";
//        player[3] = "player4";
//        player[4] = "player5";
//        player[5] = "player6";
        
    
    public void Property() {
        
        // I create an array with the properties that can be bought.
        // estate[x] = the price of the property.
        
        int[] estate;
        
        estate = new int[17];
        
        // Creating an array with 17 integers
        
        // Tribe Encampment - Territory
        estate[0] = 1000;
        
        // Crater - Territory
        estate[1] = 1500;
        
        // Mountain - Territory
        estate[2] = 2000;
        
        // Cold Desert - Territory
        estate[3] = 3000;
        
        // Black Cave - Territory
        estate[4] = 4000;
        
        // The Warewall - Territory
        estate[5] = 4300;
        
        // Mountain Village - Territory
        estate[6] = 4750;
        
        // South Citadel - Territory
        estate[7] = 5000;
        
        // Palace Gates - Territory
        estate[8] = 5500;
        
        // Tower - Territory
        estate[9] = 6000;
        
        // Castle - Territory
        estate[10] = 8000;
        
        // Huts in the Mountain - Labor camp
        estate[11] = 2500;
        
        // The Pit - Labor camp
        estate[12] = 2500;
        
        // Second Sail - Fleet
        estate[13] = 4000;
        
        // Sea Grover - Fleet
        estate[14] = 4000;
        
        // The Buccaneers - Fleet
        estate[15] = 4000;
        
        // Privateer Armade - Fleet
        estate[16] = 4000;
    }
    
}
