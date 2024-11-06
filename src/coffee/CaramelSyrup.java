package coffee;

public class CaramelSyrup extends IngredientDecorator {
    public CaramelSyrup(Drink drink) {
        super(drink);
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + ", Caramel Syrup";
    }

    @Override
    public double getCost() {
        return drink.getCost() + 350;
    }
}
