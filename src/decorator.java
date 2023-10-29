interface oldBurger {
    String getDescriptionOfOldBurger();
    double getCostOfOldBurger();
}
class BasicOldBurger implements oldBurger {
    @Override
    public String getDescriptionOfOldBurger() {
        return "Base for Black burger";
    }

    @Override
    public double getCostOfOldBurger() {
        return 1000;
    }
}
abstract class oldBurgerDecorator implements oldBurger {
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
class SauceDecorator extends oldBurgerDecorator {
    public SauceDecorator(oldBurger oldBurger) {
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

class AssortiDecorator extends oldBurgerDecorator {
    public AssortiDecorator(oldBurger oldBurger) {
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


