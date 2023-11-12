package OldSystem.Decorator;

import OldSystem.oldBurger;

abstract class oldBurgerDecorator implements OldSystem.oldBurger {
    protected oldBurger oldBurger;

    public oldBurgerDecorator(oldBurger oldBurger) {
        this.oldBurger = oldBurger;
    }

    @Override
    public String getDescriptionOfOldBurger() {
        return oldBurger.getDescriptionOfOldBurger();
    }

    @Override
    public double getCostOfOldBurger() {
        return oldBurger.getCostOfOldBurger();
    }
}
