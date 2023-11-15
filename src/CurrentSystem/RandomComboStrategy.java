package CurrentSystem;
import CurrentSystem.Factory.BurgerFactory;
import CurrentSystem.Factory.ComboBurgerFactory;
import CurrentSystem.Factory.RandomBurgerFactory;

import java.util.Scanner;

public class RandomComboStrategy implements Strategy{
    public void doSomething(Scanner scanner, Burger myBurger){
        BurgerFactory randomFactory = new RandomBurgerFactory();
        BurgerFactory comboFactory = new ComboBurgerFactory();
        Burger randomBurger = randomFactory.createBurger();
        Burger comboBurger = comboFactory.createBurger();
        System.out.println("Random Burger: " + randomBurger.getDescription());
        System.out.println("Combo Burger: " + comboBurger.getDescription());
        System.out.println("Total Cost: " + randomBurger.getCost() + " tenge");
        System.out.println("Total Cost: " + comboBurger.getCost() + " tenge");
    }
}
