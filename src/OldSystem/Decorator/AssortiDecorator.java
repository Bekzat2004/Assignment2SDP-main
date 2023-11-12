package OldSystem.Decorator;

import OldSystem.Decorator.oldBurgerDecorator;
import OldSystem.oldBurger;

class AssortiDecorator extends oldBurgerDecorator {
    public AssortiDecorator(OldSystem.oldBurger oldBurger) {
        super(oldBurger);
    }

    @Override
    public String getDescriptionOfOldBurger() {
        return oldBurger.getDescriptionOfOldBurger() + ", Assorti";
    }

    @Override
    public double getCostOfOldBurger() {
        return oldBurger.getCostOfOldBurger() + 2.0;
    }
}


