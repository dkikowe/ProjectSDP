public class NewOrderState implements OrderState {
    @Override
    public String getStatus() {
        return "New Order";
    }

    @Override
    public OrderState nextState() {
        return new InProgressState();
    }
}
