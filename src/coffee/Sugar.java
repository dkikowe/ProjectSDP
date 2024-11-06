package coffee;

public class Sugar extends IngredientDecorator {
    private int quantity;

    public Sugar(Drink drink, int quantity) {
        super(drink);
        this.quantity = quantity;
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + ", Sugar x" + quantity;
    }

    @Override
    public double getCost() {
        return drink.getCost() + 10 * quantity;
    }
}
