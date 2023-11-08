import java.util.ArrayList;

interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}

class WeatherStation implements Subject {
    private ArrayList<Observer> observers = new ArrayList<>();
    private int temperature;

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }
}

interface Observer {
    void update(int temperature);
}

class WeatherDisplay implements Observer {
    public void update(int temperature) {
        System.out.println("Weather Display updates temperature to " + temperature + "°C");
    }
}

class PhoneApp implements Observer {
    public void update(int temperature) {
        System.out.println("Phone App updates temperature to " + temperature + "°C");
    }
}

public class Q2 {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        WeatherDisplay display = new WeatherDisplay();
        PhoneApp app = new PhoneApp();

        weatherStation.registerObserver(display);
        weatherStation.registerObserver(app);

        System.out.println();
        System.out.println("Weather Station setting temperature to 25°C");
        weatherStation.setTemperature(25);
        System.out.println();
        System.out.println("Weather Station setting temperature to 30°C");
        weatherStation.setTemperature(30);
    }
}
