class ExpensiveBurger implements Burger {
    @Override
    public String getDescription() {
        return "King Burger (Tripled beef cutlets with MegaExtraTasty sauce and SuperGigaNanoBest cheese in the world)";
    }

    @Override
    public double getCost() {
        return 5000;
    }
}
