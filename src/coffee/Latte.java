package coffee;

public class Latte extends Drink{
    @Override
    public String getDescription() {
        return "Latte";
    }

    @Override
    public double getCost() {
        return 890;
    }
}
