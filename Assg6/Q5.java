import java.util.Scanner;

class Car {
    private String modelName;
    private String engineNo;
    private double basePrice;
    private double additionalCharge;

    public Car(String modelName, String engineNo, double basePrice, double additionalCharge) {
        this.modelName = modelName;
        this.engineNo = engineNo;
        this.basePrice = basePrice;
        this.additionalCharge = additionalCharge;
    }

    public double getTotalPrice() {
        return basePrice + additionalCharge;
    }

}

class Dealer {
    private String dealerName;
    private float discountPercentage;
    private Car car;

    public Dealer(String dealerName, float discountPercentage, Car car) {
        this.dealerName = dealerName;
        this.discountPercentage = discountPercentage;
        this.car = car;
    }

    public double onRoadPrice() {
        double totalPrice = car.getTotalPrice();
        double discountAmount = (discountPercentage / 100) * totalPrice;
        return totalPrice - discountAmount;
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            String modelName = scanner.next();
            String engineNo = scanner.next();
            double basePrice = scanner.nextDouble();
            double additionalCharge = scanner.nextDouble();
            Car car = new Car(modelName, engineNo, basePrice, additionalCharge);
            String dealerName = scanner.next();
            float discountPercentage = scanner.nextFloat();
            Dealer dealer = new Dealer(dealerName, discountPercentage, car);
            System.out.println(modelName + " " + String.format("%.2f %.2f", car.getTotalPrice(), dealer.onRoadPrice()));
        }
        scanner.close();
    }
}
