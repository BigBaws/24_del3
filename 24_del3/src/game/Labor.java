package game;

public class Labor extends Ownable {
    protected String fieldname;
    private int baserent;
     
    public Labor(String name) {
        super(name);
        super.fieldprice=2500;
        super.fieldowned=false;
    }
 
    @Override
    public int getRent() {
        int fieldrent = 100 * getDiceValue();
        return fieldrent;
    }
    
    public int getDiceValue() {
        return dice.getSum();
    }

    @Override
    public String getName() {
        return fieldname;
    }

    @Override
    public int getPrice() {
        return 0;
    }

}
