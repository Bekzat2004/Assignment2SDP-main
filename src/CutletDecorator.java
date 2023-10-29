class CutletDecorator extends BurgerDecorator {
    public CutletDecorator(Burger burger) {
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Cutlet";
    }

    @Override
    public double getCost() {
        return burger.getCost() + 1000;
    }
}
