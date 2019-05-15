/**
 * Item
 */
public class Item {
    String name;
    int price;
    static int objectNum;

    Item(String name, int price) {
        this.name = name;
        this.price = price;
        objectNum++;
    }

    static int getNumberOfInstances() {
        return objectNum;
    }

    public String toString() {
        return name + ", " + price;
    }
}