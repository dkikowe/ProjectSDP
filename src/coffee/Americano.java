package coffee;

public class Americano extends Drink{
    @Override
    public String getDescription() {
        return "Americano";
    }

    @Override
    public double getCost() {
        return 700;
    }
}
