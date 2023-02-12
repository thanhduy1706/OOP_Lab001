import java.util.ArrayList;

public class Items extends Order{
    private int ID, price;
    private String name;

    public Items(int ID, ArrayList<Items> itemsList, int ID1, int price, String name) {
        super(ID, itemsList);
        this.ID = ID1;
        this.price = price;
        this.name = name;
    }



    @Override
    public int getID() {
        return ID;
    }

    @Override
    public void setID(int ID) {
        this.ID = ID;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
