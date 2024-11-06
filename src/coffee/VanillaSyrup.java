package coffee;

public class VanillaSyrup extends IngredientDecorator {
    public VanillaSyrup(Drink drink) {
        super(drink);
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + ", Vanilla Syrup";
    }

    @Override
    public double getCost() {
        return drink.getCost() + 0.50;
    }
}
