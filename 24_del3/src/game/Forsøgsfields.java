package game;

public class Forsøgsfields {
    public Forsøgsfields(){
        Territory[] territory = new Territory[11];
        
        territory[0] = new Territory("Tripe Encampment",1000,100);
        territory[1] = new Territory("Crater",1500,300);
        territory[2] = new Territory("Mountain",2000,500);
        territory[3] = new Territory("Cold Desert",3000,700);
        territory[4] = new Territory("Black Cave",4000,1000);
        territory[5] = new Territory("The Werewall",4300,1300);
        territory[6] = new Territory("Mountain Village",4750,1600);
        territory[7] = new Territory("South Citadel",5000,2000);
        territory[8] = new Territory("Palace Gates",5500,2600);
        territory[9] = new Territory("Tower",6000,3200);
        territory[10] = new Territory("Castle",8000,4000);
        Fleet[] fleet = new Fleet[4];
        fleet[0]=new Fleet("Second Sail");
        fleet[1]=new Fleet("Sea Grover");
        fleet[2]=new Fleet("The Buccaneers");
        fleet[3]=new Fleet("Privateer armade");
    }
    
}
