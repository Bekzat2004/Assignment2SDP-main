package CurrentSystem.Observer;

interface DatabaseSubject {
    void registerObserver(DatabaseObserver observer);

    void removeObserver(DatabaseObserver observer);

    void notifyObservers();
}