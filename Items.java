public class Items {
    private int id;
    private String name;
    private double price;

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public Items(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
