import CurrentSystem.*;
import CurrentSystem.Observer.Client;
import CurrentSystem.Singleton.Database;
import CurrentSystem.Strategy.BurgerBuildingStrategy;
import CurrentSystem.Strategy.RandomComboStrategy;
import CurrentSystem.Strategy.Strategy;
import CurrentSystem.Strategy.StrategyContext;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Database database = Database.getInstance();

        Client client1 = new Client("Administrator");
        Client client2 = new Client("Cook");
        database.registerObserver(client1);
        database.registerObserver(client2);


        database.setData("Basis for Classic burger");
        database.closeConnection();
        Scanner scanner = new Scanner(System.in);
        Burger myBurger = new BasicBurger();
        Strategy burgerBuilding = new BurgerBuildingStrategy();
        Strategy randomCombo = new RandomComboStrategy();
        StrategyContext context = new StrategyContext(burgerBuilding);
        System.out.println("Welcome to FastBurger restaurant!");
        System.out.println("Do you want to create custom burger (type 1) or buy surprise combo (type 2)? ");
        int choice = scanner.nextInt();
        if (choice == 1){
            context.performStrategy(scanner, myBurger);
        }
        else if (choice == 2){
            context.setStrategy(randomCombo);
            context.performStrategy(scanner, myBurger);
        }
    }
}


