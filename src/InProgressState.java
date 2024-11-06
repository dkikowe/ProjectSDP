public class InProgressState implements OrderState {
    @Override
    public String getStatus() {
        return "In Progress";
    }

    @Override
    public OrderState nextState() {
        return new ReadyForPickupState();
    }
}
