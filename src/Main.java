import food.*;
import coffee.*;

public class Main {
    public static void main(String[] args) {
        OrderFacade facade = new OrderFacade();

        Order order = facade.createOrder("panini", "americano", 2, true, false, false);

        facade.printOrderDetails(order);

        OrderContext orderContext = new OrderContext();

        OrderNotifier notifier = new OrderNotifier();
        Barista barista = new Barista();

        notifier.addObserver(barista);

        notifier.notifyObservers("New Order!");
        System.out.println("Order Status: " + orderContext.getStatus());
        orderContext.nextState();
        System.out.println("Order Status: " + orderContext.getStatus());
        orderContext.nextState();
        System.out.println("Order Status: " + orderContext.getStatus());


    }
}
