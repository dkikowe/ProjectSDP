package coffee;

public class CoconutSyrup extends IngredientDecorator {
    public CoconutSyrup(Drink drink) {
        super(drink);
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + ", Coconut Syrup";
    }

    @Override
    public double getCost() {
        return drink.getCost() + 300;
    }
}
