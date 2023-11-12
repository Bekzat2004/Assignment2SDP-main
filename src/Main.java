import CurrentSystem.*;
import CurrentSystem.Adapter.*;
import CurrentSystem.Decorator.*;
import CurrentSystem.Factory.*;
import OldSystem.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Burger myBurger = new BasicBurger();
        System.out.println("Welcome to FastBurger restaurant!");
        System.out.println("Do you want to create custom burger (type 1) or buy surprise combo (type 2)? ");
        int choice = scanner.nextInt();
        if (choice == 1){
            System.out.println("Welcome to burger builder tool!");
            System.out.println("Do you want to start? (1 for yes, 0 for no)");
            int startChoice = scanner.nextInt();
            if (startChoice == 1) {
                System.out.println("Excellent! Which of these burgers do you want? (1 for Black Burger, 2 for Classic Burger)");
                int burgerChoice = scanner.nextInt();
                if(burgerChoice == 1){
                    myBurger = new BasicOldBurgerAdapter(new BasicOldBurger());
                }
                else if(burgerChoice == 2){
                    myBurger = new BasicBurger();
                }
                System.out.println("Do you want to add extra cutlet? (1 for yes, any other respond for no)");
                int cutletChoice = scanner.nextInt();
                if (cutletChoice == 1) {
                    myBurger = new CutletDecorator(myBurger);
                }
                System.out.println("Do you want to add cheese? (1 for yes, any other respond for no)");
                int cheeseChoice = scanner.nextInt();
                if (cheeseChoice == 1) {
                    myBurger = new CheeseDecorator(myBurger);
                }
                System.out.println("Do you want to add tomato? (1 for yes, any other respond for no)");
                int tomatoChoice = scanner.nextInt();
                if (tomatoChoice == 1) {
                    myBurger = new TomatoDecorator(myBurger);
                }
                System.out.println("Do you want to add salad? (1 for yes, any other respond for no)");
                int saladChoice = scanner.nextInt();
                if (saladChoice == 1) {
                    myBurger = new SaladDecorator(myBurger);
                }
            }
            System.out.println("Burger Description: " + myBurger.getDescription());
            System.out.println("Total Cost: " + myBurger.getCost() + " tenge");
        }
        else if (choice == 2){
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
}


