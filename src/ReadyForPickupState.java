public class ReadyForPickupState implements OrderState {
    @Override
    public String getStatus() {
        return "Ready for Pickup";
    }

    @Override
    public OrderState nextState() {
        return this;
    }
}
