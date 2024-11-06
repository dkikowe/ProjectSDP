package food;

public class MenuItemFactory {
    public static MenuItem createMenuItem(String itemType) {
        switch (itemType.toLowerCase()) {
            case "panini":
                return new Panini();
            case "donut":
                return new Donut();
            case "croissant":
                return new Croissant();
            default:
                throw new IllegalArgumentException("Unknown menu item type");
        }
    }
}
