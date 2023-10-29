class MediumBurger implements Burger {
    @Override
    public String getDescription() {
        return "Big Classic Burger (Doubled beef cutlets with extra cheese and special sauce)";
    }

    @Override
    public double getCost() {
        return 2500;
    }
}
