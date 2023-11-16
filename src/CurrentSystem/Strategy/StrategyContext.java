package CurrentSystem.Strategy;

import CurrentSystem.Burger;

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
