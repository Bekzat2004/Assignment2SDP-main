class BasicBurger implements Burger {
    @Override
    public String getDescription() {
        return "Base for Classic burger";
    }
    @Override
    public double getCost() {
        return 800;
    }
}
