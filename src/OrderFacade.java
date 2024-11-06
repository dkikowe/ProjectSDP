import food.*;
import coffee.*;

public class OrderFacade {
    private OrderBuilder orderBuilder;

    public OrderFacade() {
        this.orderBuilder = new OrderBuilder();
    }

    public Order createOrder(String food, String drinkType, int sugar, boolean caramel, boolean vanilla, boolean coconut) {
        return orderBuilder
                .addFood(food)
                .addDrink(drinkType, sugar, caramel, vanilla, coconut)
                .calculateCost(food , drinkType ,sugar, caramel, vanilla, coconut)
                .build();
    }

    public void printOrderDetails(Order order) {
        System.out.println("Order Details:");
        for (String item : order.getItems()) {
            System.out.println("- " + item);
        }
        System.out.println("Status: " + order.getStatus());
    }
}
