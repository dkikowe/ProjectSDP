import coffee.*;
import food.*;

public class OrderBuilder {
    private Order order;

    public OrderBuilder() {
        this.order = new Order();
    }

    public OrderBuilder addDrink(String drinkType, int sugarAmount, boolean caramel, boolean vanilla, boolean coconut) {
        Drink drink = new BasicCoffee();

        if (sugarAmount > 0) {
            drink = new Sugar(drink, sugarAmount);
        }
        if (caramel) {
            drink = new CaramelSyrup(drink);
        }
        if (vanilla) {
            drink = new VanillaSyrup(drink);
        }
        if (coconut) {
            drink = new CoconutSyrup(drink);
        }

        order.addItem(drink.getDescription() + " | Total Cost: $" + drink.getCost());
        return this;
    }

    public OrderBuilder addFood(String foodType) {
        MenuItem food = MenuItemFactory.createMenuItem(foodType);
        order.addItem(food.prepare());
        return this;
    }

    public Order build() {
        return order;
    }
}
