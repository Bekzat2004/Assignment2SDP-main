package CurrentSystem.Singleton;

import CurrentSystem.Observer.*;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private static Database instance;
    private List<DatabaseObserver> observers = new ArrayList<>();
    private String data;

    private Database() {
    }

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public void setData(String newData) {
        this.data = newData;
        notifyObservers();
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
        System.out.println("Database connection closed.");
    }

}

