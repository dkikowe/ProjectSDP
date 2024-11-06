public class Barista implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Barista received message: " + message);
    }
}
