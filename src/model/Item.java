package model;

public class Item {
    private String Name;
    private String itemID;
    private long price;
    private int sumItem;
    private int amount;

    public Item() {}

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getSumItem() {
        return sumItem;
    }

    public void sumItem(int sum) {
        this.sumItem += sum;
    }

    public void subtract(int subtract) {
        this.sumItem -= subtract;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }


    public Item(String name, String itemID, long price, int sumItem) {
        Name = name;
        this.itemID = itemID;
        this.price = price;
        this.sumItem = sumItem;
    }

    @Override
    public String toString() {
        return "model.Item " +
                "Name = '" + Name + '\'' +
                ", itemID = '" + itemID + '\'' +
                ", price = " + price ;
    }
}
