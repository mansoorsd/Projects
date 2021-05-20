public class HamBurger {

    private String breadRoll;
    private boolean meat;
    private int price;
    private boolean lettuce;
    private boolean tomato;
    private boolean carrot;
    private boolean cheese;

    public HamBurger(String breadRoll, boolean lettuce, boolean tomato, boolean carrot, boolean cheese) {
        this.breadRoll = breadRoll;
        this.meat = true;
        this.price = 0;
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.carrot = carrot;
        this.cheese = cheese;
    }

    public int normalBurgerPrice() {
        this.breadRoll = breadRoll;
        this.price = 50;
        return price;
    }

    public int bill() {
        this.price=0;
        if (lettuce) {
            System.out.println(" + lettuce" + " price 10");
            this.price += 10;
        }
        if (tomato) {
            System.out.println(" + tomato" + " price 15");
            this.price += 15;
        }
        if (carrot) {
            System.out.println(" + carrot" + " price 12");
            this.price += 12;
        }
        if (cheese) {
            System.out.println(" + cheese" + " price 20");
            this.price += 20;
        }
        System.out.println("additional price " + this.price);
        return this.price;

    }


}




