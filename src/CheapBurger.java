class CheapBurger implements Burger {
    @Override
    public String getDescription() {
        return "Classic Burger (Beef cutlet with cheese)";
    }

    @Override
    public double getCost() {
        return 1500;
    }
}
