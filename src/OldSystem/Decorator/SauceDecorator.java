package OldSystem.Decorator;

class SauceDecorator extends oldBurgerDecorator {
    public SauceDecorator(OldSystem.oldBurger oldBurger) {
        super(oldBurger);
    }

    @Override
    public String getDescriptionOfOldBurger() {
        return oldBurger.getDescriptionOfOldBurger() + ", Sauce";
    }

    @Override
    public double getCostOfOldBurger() {
        return oldBurger.getCostOfOldBurger() + 1.0;
    }
}
