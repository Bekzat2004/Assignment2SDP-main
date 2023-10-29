class BasicOldBurgerAdapter implements Burger {
    private oldBurger oldBurger;
    public BasicOldBurgerAdapter(oldBurger oldBurger){
        this.oldBurger = oldBurger;
    }
    @Override
    public String getDescription() {
        return oldBurger.getDescriptionOfOldBurger();
    }

    @Override
    public double getCost() {
        return oldBurger.getCostOfOldBurger();
    }
}
