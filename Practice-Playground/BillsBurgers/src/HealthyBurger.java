public class HealthyBurger extends HamBurger{

    private boolean sos;
    private boolean onions;


    public HealthyBurger(  boolean sos, boolean onions) {
        super("brown rye bread roll", true, true, true, true);
this.sos=true;
this.onions=onions;

    }

    @Override
    public void bill() {

    }
}
