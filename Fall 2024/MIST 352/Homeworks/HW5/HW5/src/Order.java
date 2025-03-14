import java.util.ArrayList;

// Order.java
public class Order {
    private ArrayList<Coffee> coffees;
    private double totalPrice;

    public Order() {
        coffees = new ArrayList<>();
        totalPrice = 0.0;
    }

    public void addCoffee(Coffee coffee) {
        coffees.add(coffee);
        totalPrice += coffee.getPrice();
        Coffee.sellCoffee();
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Order Total: $" + totalPrice;
    }
}