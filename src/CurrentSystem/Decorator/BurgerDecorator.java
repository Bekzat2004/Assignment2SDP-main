package CurrentSystem.Decorator;

import CurrentSystem.Burger;

abstract class BurgerDecorator implements Burger {
    protected Burger burger;

    public BurgerDecorator(Burger burger) {
        this.burger = burger;
    }
}
