import java.util.Random;

class RandomBurgerFactory implements BurgerFactory {
    @Override
    public Burger createBurger() {
        Random random = new Random();
        int choice = random.nextInt(3);
        switch (choice) {
            case 0:
                return new CheapBurger();
            case 1:
                return new MediumBurger();
            case 2:
                return new ExpensiveBurger();
            default:
                return null;
        }
    }
}
