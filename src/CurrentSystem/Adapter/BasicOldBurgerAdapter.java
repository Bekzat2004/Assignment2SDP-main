package CurrentSystem.Adapter;

import CurrentSystem.Burger;
import OldSystem.*;

public class BasicOldBurgerAdapter implements Burger {
    private OldSystem.oldBurger oldBurger;

    public BasicOldBurgerAdapter(oldBurger oldBurger) {
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
