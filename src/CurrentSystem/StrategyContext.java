package CurrentSystem;
import java.util.Scanner;

public class StrategyContext {
    private Strategy strategy;

    public StrategyContext(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void performStrategy(Scanner scanner, Burger myBurger) {
        strategy.doSomething(scanner, myBurger);
    }
}
