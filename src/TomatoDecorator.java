class TomatoDecorator extends BurgerDecorator{
    public TomatoDecorator(Burger burger) {
        super(burger);
    }
    public String getDescription(){
        return burger.getDescription() + ", Tomato";
    }
    public double getCost(){
        return burger.getCost() + 150;
    }
}
