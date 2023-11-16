package CurrentSystem.Strategy;

import CurrentSystem.Burger;
import CurrentSystem.Factory.BurgerFactory;
import CurrentSystem.Factory.ComboBurgerFactory;
import CurrentSystem.Factory.RandomBurgerFactory;
import CurrentSystem.Singleton.Database;

import java.util.Scanner;

public class RandomComboStrategy implements Strategy {
    public void doSomething(Scanner scanner, Burger myBurger) {
        Database database = Database.getInstance();
        System.out.println("If you want fully randomized combo, type 1. If you want combo with customized probabilities, type 2.");
        int choiceOfCombo = scanner.nextInt();
        if (choiceOfCombo == 1) {
            BurgerFactory randomFactory = new RandomBurgerFactory();
            Burger randomBurger = randomFactory.createBurger();
            System.out.println("Random Burger: " + randomBurger.getDescription());
            System.out.println("Total Cost: " + randomBurger.getCost() + " tenge");
            database.setData("Random Burger: " + randomBurger.getDescription());
        } else if (choiceOfCombo == 2) {
            BurgerFactory comboFactory = new ComboBurgerFactory();
            Burger comboBurger = comboFactory.createBurger();
            System.out.println("Combo Burger: " + comboBurger.getDescription());
            System.out.println("Total Cost: " + comboBurger.getCost() + " tenge");
            database.setData("Combo Burger: " + comboBurger.getDescription());
        }
    }
}
