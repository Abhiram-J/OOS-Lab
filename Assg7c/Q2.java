import java.util.ArrayList;

class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

class SessionManager {
    private static SessionManager instance = null;
    private ArrayList<Pair<String, String>> userCredentialsList;

    private SessionManager() {
        userCredentialsList = new ArrayList<>();

        userCredentialsList.add(new Pair<>("user1", "1password1"));
        userCredentialsList.add(new Pair<>("user2", "123pass"));
    }

    public static SessionManager getInstance() {
        if (instance == null) {
            instance = new SessionManager();
        }
        return instance;
    }

    public boolean login(String username, String password) {
        for (Pair<String, String> credentials : userCredentialsList) {
            if (credentials.getKey().equals(username) && credentials.getValue().equals(password)) {
                return true;
            }
        }
        return false;
    }

}

public class Q2 {
    public static void main(String[] args) {
        SessionManager sessionManager = SessionManager.getInstance();

        boolean loggedIn1 = sessionManager.login("user1", "password123");
        boolean loggedIn2 = sessionManager.login("user2", "123pass");
        boolean loggedIn3 = sessionManager.login("user3", "idontknow");

        System.out.println("User 1 login result: " + loggedIn1);
        System.out.println("User 2 login result: " + loggedIn2);
        System.out.println("User 3 login result: " + loggedIn3);
    }
}