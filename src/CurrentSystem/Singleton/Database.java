package CurrentSystem.Singleton;

import CurrentSystem.Observer.*;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private static Database instance;
    private List<DatabaseObserver> observers = new ArrayList<>();
    private String data; // Simulated database data

    private Database() {
        // Private constructor to prevent instantiation from outside
    }

    public static Database getInstance() {
        if (instance == null) {
            // Lazy initialization: create the instance only if it doesn't exist yet
            instance = new Database();
        }
        return instance;
    }

    public void setData(String newData) {
        this.data = newData;
        notifyObservers(); // Notify observers when data changes
    }

    public void registerObserver(DatabaseObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(DatabaseObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (DatabaseObserver observer : observers) {
            observer.update(data);
        }
    }
    public void closeConnection() {
        // Simulate closing the database connection
        System.out.println("Database connection closed.");
    }

}

