package food;

public abstract class MenuItem {
    protected double price;

    public double getPrice() {
        return price;
    }

    public abstract String prepare();
}
