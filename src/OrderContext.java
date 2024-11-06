public class OrderContext {
    private OrderState state;

    public OrderContext() {
        state = new NewOrderState();
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public String getStatus() {
        return state.getStatus();
    }

    public void nextState() {
        state = state.nextState();
    }
}
