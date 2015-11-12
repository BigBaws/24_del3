package game;

public class Fleet extends Ownable {
    private int RENT_1 = 500;
    private int RENT_2 = 1000;
    private int RENT_3 = 2000;
    private int RENT_4 = 4000;
    public Fleet() {
price=4000;

}
    public int setRent(int nr){
switch (nr){
case 1:
    rent=RENT_1;
    break;
case 2:
    rent=RENT_2;
    break;
case 3:
    rent=RENT_3;
    break;
case 4:
    rent=RENT_4;
    break;
            
        
        
    }
return rent;
    }
}