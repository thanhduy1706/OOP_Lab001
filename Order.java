import java.util.ArrayList;
public class Order {
    private int id;
    private ArrayList<Items> items;
    public Order(int id, ArrayList<Items> items) {
        this.id = id;
        this.items = items;
    }

    public double calculateAverageCost() {
        double totalCost = 0;
        for (int i=0; i<items.size(); i++) {
            totalCost += items.get(i).getPrice();
        }
        return totalCost / items.size();
    }
}