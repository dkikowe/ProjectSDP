package food;

public class Panini extends MenuItem {
    public Panini(){
        this.price = 1300;
    }
    @Override
    public String prepare() {
        return "Panini prepared";
    }
}
