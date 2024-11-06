import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<String> items = new ArrayList<>();
    private String status = "new";

    public void addItem(String item) {
        items.add(item);
    }

    public List<String> getItems() {
        return items;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
