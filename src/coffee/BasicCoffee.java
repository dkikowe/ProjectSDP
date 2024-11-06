package coffee;

public class BasicCoffee extends Drink {
    @Override
    public String getDescription() {
        return "Coffee";
    }

    @Override
    public double getCost() {
        return 3.00;
    }
}
