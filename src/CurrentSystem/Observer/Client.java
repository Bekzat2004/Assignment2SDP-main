package CurrentSystem.Observer;

public class Client implements DatabaseObserver {
    private String clientName;

    public Client(String clientName) {
        this.clientName = clientName;
    }

    @Override
    public void update(String data) {
        System.out.println("Client " + clientName + " notified. Updated data: " + data);
    }
}