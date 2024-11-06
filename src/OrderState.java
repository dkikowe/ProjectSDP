public interface OrderState {
    String getStatus();
    OrderState nextState();
}
