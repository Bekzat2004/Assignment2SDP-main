import java.util.Random;

class ComboBurgerFactory implements BurgerFactory {
    @Override
    public Burger createBurger() {
        Random random = new Random();
        double chance = random.nextDouble();
        if (chance < 0.6) {
            return new CheapBurger();
        } else if (chance < 0.9) {
            return new MediumBurger();
        } else {
            return new ExpensiveBurger();
        }
    }
}
