public class DeluxeBurger extends Hamburger{
    private boolean chips;
    private boolean drinks;

    public DeluxeBurger(String rollType, String meat, boolean chips, boolean drinks) {
        super(rollType, meat);
        this.chips = chips;
        this.drinks = drinks;
    }

    @Override
    public int calculateprice(boolean lettuce, boolean tomato, boolean carrot, boolean pickle) {
        int beforetotal = super.calculateprice(lettuce, tomato, carrot, pickle);
        if(chips) beforetotal+=5;
        if(drinks) beforetotal+=5;

        return beforetotal;
    }
}
