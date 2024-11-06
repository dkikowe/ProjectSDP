import java.util.ArrayList;
import java.util.List;

public class OrderNotifier {
    private List<Observer> observers = new ArrayList<>();

    // Метод для добавления наблюдателя
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Метод для удаления наблюдателя
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // Метод для уведомления всех наблюдателей
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
