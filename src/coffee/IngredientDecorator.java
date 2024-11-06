package coffee;

public abstract class IngredientDecorator extends Drink {
    protected Drink drink;

    public IngredientDecorator(Drink drink) {
        this.drink = drink;
    }
}
