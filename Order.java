import java.util.ArrayList;

public class Order
{
    private int ID;
    private ArrayList<Items> itemsList;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public ArrayList<Items> getItemsList() {
        return itemsList;
    }

    public void setItemsList(ArrayList<Items> itemsList) {
        this.itemsList = itemsList;
    }

    public Order(int ID, ArrayList<Items> itemsList) {
        this.ID = ID;
        this.itemsList = itemsList;
    }

    public double calculateAverageCost()
    {
    return 1;
    }
}

