import coffee.*;
import food.*;

public class OrderBuilder {
    private Order order;

    public OrderBuilder() {
        this.order = new Order();
    }

    public OrderBuilder addDrink(String drinkType, int sugarAmount, boolean caramel, boolean vanilla, boolean coconut) {
        Drink drink = new BasicCoffee();

        switch (drinkType.toLowerCase()){
            case "latte":
                drink = new Latte();
                break;
            case "americano":
                drink = new Americano();
                break;
            case "capuccino":
                drink = new Capuccino();
                break;
        }

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

        order.addItem(drink.getDescription() + " | Coffee Cost: " + drink.getCost() + "tg") ;
        return this;
    }

    public OrderBuilder addFood(String foodType) {
        MenuItem food = MenuItemFactory.createMenuItem(foodType);
        order.addItem(food.prepare() + " | Food Cost: " + food.getPrice() + "tg");
        return this;
    }

    public OrderBuilder calculateCost(String foodType, String drinkType, int sugarAmount, boolean caramel, boolean vanilla, boolean coconut){
        MenuItem food = MenuItemFactory.createMenuItem(foodType);
        Drink drink = new BasicCoffee();
        switch (drinkType.toLowerCase()){
            case "latte":
                drink = new Latte();
                break;
            case "americano":
                drink = new Americano();
                break;
            case "capuccino":
                drink = new Capuccino();
                break;
        }

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

        double calculatedTotal = drink.getCost()+food.getPrice();
        order.addItem("-----Total cost: " + calculatedTotal + "tg ---------");
        return this;
    }

    public Order build() {
        return order;
    }
}
