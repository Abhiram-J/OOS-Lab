import java.util.ArrayList;

interface Observer {
    void receiveMessage(String message);
}

class MessageService {
    private ArrayList<Observer> observers = new ArrayList<>();

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.receiveMessage(message);
        }
    }

    public void sendMessage(String message) {
        System.out.println("Notifying Observers...");
        notifyObservers(message);
    }
}

class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void receiveMessage(String message) {
        System.out.println(name + " received a new message: " + message);
    }
}

public class Q3 {
    public static void main(String[] args) {
        MessageService messageService = new MessageService();

        User user1 = new User("Alice");
        User user2 = new User("Bob");

        messageService.registerObserver(user1);
        messageService.registerObserver(user2);

        System.out.println();
        System.out.println("Sending message : Hello Alice and Bob");
        messageService.sendMessage("Hello Alice and Bob");
        System.out.println();
        System.out.println("Sending message : How are you today?");
        messageService.sendMessage("How are you today?");

        System.out.println();
        System.out.println("Removing Alice..");
        messageService.removeObserver(user1);
        System.out.println();
        System.out.println("Sending message : Just checking in on you, Bob");
        messageService.sendMessage("Just checking in on you, Bob");
    }
}
