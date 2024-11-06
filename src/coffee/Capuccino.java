package coffee;

public class Capuccino extends Drink{
    @Override
    public String getDescription() {
        return "Capuccino";
    }

    @Override
    public double getCost() {
        return 890;
    }
}
