package CurrentSystem.Decorator;

import CurrentSystem.Burger;
import CurrentSystem.Decorator.BurgerDecorator;

public class CheeseDecorator extends BurgerDecorator {
    public CheeseDecorator(Burger burger) {
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Cheese";
    }

    @Override
    public double getCost() {
        return burger.getCost() + 300;
    }
}
