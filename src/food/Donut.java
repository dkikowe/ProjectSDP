package food;

public class Donut extends MenuItem {
    public Donut(){
        this.price = 590;
    }
    @Override
    public String prepare() {
        return "Donut prepared";
    }
}
