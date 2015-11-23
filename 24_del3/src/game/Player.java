package game;

import game.Bank;;

public class Player 
{
    private Bank b = new Bank();
    private String name;

    public Player(String name) 
    {
        this.name = name;
    }
/**
 * returnere spillerens navn
 * @return
 */
    public String getName() 
    {
        return name;
    }
/**
 * aendre spillerens navn, tager nyt navn.
 * @param name
 */
    public void setName(String name) 
    {
        this.name = name;
    }
/**
 * returnere spillerens pengebeholdning
 * @return
 */
    public int getScore() 
    {
        return b.getscore();
    }
/**
 * aendre spillerens pengebeholdning, og forhindre at denne bliver negativ (OBS. b�r redigeres)
 * @param score
 */
    public void setScore(int score) 
    {
        b.setscore(score);
        if (b.getscore() < 0) 
        {
            b.setscore(0);
        }
    }
    /**
     * aedre p� v�rdien af spillerens felter (b�r kun bruges i forbindelse af k�b eller salg) 
     * @param value
     */
    public void setOwnedvalue(int value){
    b.SetEstateValue(value);
    
    
}
    /**
     * returnere spillerens totale vaerdier, ejendommenes vaerdi samt pengeforsyning.
     * @return
     */
    public int gettotalassets(){
        return b.TotalAssets();
        }
    /**
     * benyttes til at saelge felter.
     */
    public void sellfields(){
        b.sellfields();
            
    }
}
