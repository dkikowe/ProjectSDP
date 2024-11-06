package food;

public class Croissant extends MenuItem {
    public Croissant(){
        this.price = 590;
    }
    @Override
    public String prepare() {
        return "Croissant prepared";
    }
}
