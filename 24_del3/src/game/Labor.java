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
        int fieldrent = 100 * dice.getSum();
        return fieldrent;
    }

    @Override
    public String getName() {
        return fieldname;
    }

    @Override
    public int getPrice() {
        return super.fieldprice;
    }

}
