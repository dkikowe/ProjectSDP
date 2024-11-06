import food.*;
import coffee.*;

public class Main {
    public static void main(String[] args) {
        OrderFacade facade = new OrderFacade();

        Order order = facade.createOrder("panini", "latte", 2, true, true, false);

        facade.printOrderDetails(order);

        OrderContext orderContext = new OrderContext();
        System.out.println("Order Status: " + orderContext.getStatus());
        orderContext.nextState();
        System.out.println("Order Status: " + orderContext.getStatus());
        orderContext.nextState();
        System.out.println("Order Status: " + orderContext.getStatus());

        OrderNotifier notifier = new OrderNotifier();
        Barista barista = new Barista();

        notifier.addObserver(barista);

        notifier.notifyObservers("Order is ready for pickup!");
    }
}
