package game;

// Banken skal holde på ejendomme, alt omkring ejendomme skal foregå internt i banken.
// Der skal laves en metode som der kan trække penge, sætte penge ind på anden konto og som der deler ejendommene ud.

public class Bank{
    private Field[] properties = new Field[17];
    private int score;
    
//    int[] Owned;
//    Owned = new int[17];

    
    public Bank(){
        
            score = 30000;      
        }
    /**
     * returnere pengebeholdning
     * @return
     */
        public int getscore(){
            return score;
        }
        /**
         * aedre spillerens pengebeholdning
         * @param score
         */
        public void setscore (int score){
            this.score = this.score + score;
            if(score<0 && amount+score>0){
                while(score<0){
                sellfields();
            }
         // lav en else der bruger en metode i spiller der sender spilleren selv til lukning i game (spørg hvis i tvivl)
            }
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
        
    
//    public void Property(Ownable own) {
//        
//        String[] estateName;
//        
//        estateName = new String[17];
//        
//        estateName[0] = own.getName();
//        
//    }
    private int amount;
    /**
     * returnere bankens totale værd
     * @return
     */
    public int TotalAssets(){
        
        return amount+score;
        
    }
    
    /**
     * aedre vaedien af spillerens samlede ejendomme.
     * @param value
     */
    public void SetEstateValue(int value){
        
       amount = amount + value;
        
        // 1 En metode der kan fortælle hvilke felter man ejer ud fra navn.
        
    }
    /**
     * skal bruges naar spilleren oensker at saelge et felt, metode skal liste
     *  alle spillerens felter og give ham mulighed for at saelge ét af dem til banken.
     */
    public void sellfields(){
        //metoden skal fjerne et felt fra properties arrayet og erstate det med null,
        //og give spilleren pengene fra feltet igen.
        
    }
    public void setOwned(Field field){
       // find en maade at lave et sorteret field array (array er oprettet ved navn "properties".
        //til noed kan en switch(fieldname) med case til hvert felt bruges 
            
        }
    }
//    
//    public void Smthn3(){
//        
//        // 3 En metode der skal tilføje værdien til et købt felt.
//        
//    }
//    
//    public void Smthn4(){
//        
//        // 4 En metode der holder styr på den totale værdi af alle ejendomme som en spiller ejer.
//        
//    }
//        
//        
        // I create an array with the properties that can be bought.
        // estate[x] = the price of the property.
        
//        int[] estate;
//        
//        estate = new int[17];
//        
//        // Creating an array with 17 integers
//        
//        // Tribe Encampment - Territory
//        estate[0] = 1000;
//        
//        // Crater - Territory
//        estate[1] = 1500;
//        
//        // Mountain - Territory
//        estate[2] = 2000;
//        
//        // Cold Desert - Territory
//        estate[3] = 3000;
//        
//        // Black Cave - Territory
//        estate[4] = 4000;
//        
//        // The Warewall - Territory
//        estate[5] = 4300;
//        
//        // Mountain Village - Territory
//        estate[6] = 4750;
//        
//        // South Citadel - Territory
//        estate[7] = 5000;
//        
//        // Palace Gates - Territory
//        estate[8] = 5500;
//        
//        // Tower - Territory
//        estate[9] = 6000;
//        
//        // Castle - Territory
//        estate[10] = 8000;
//        
//        // Huts in the Mountain - Labor camp
//        estate[11] = 2500;
//        
//        // The Pit - Labor camp
//        estate[12] = 2500;
//        
//        // Second Sail - Fleet
//        estate[13] = 4000;
//        
//        // Sea Grover - Fleet
//        estate[14] = 4000;
//        
//        // The Buccaneers - Fleet
//        estate[15] = 4000;
//        
//        // Privateer Armade - Fleet
//        estate[16] = 4000;
    
