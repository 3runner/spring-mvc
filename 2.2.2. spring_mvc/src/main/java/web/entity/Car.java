package web.entity;

public class Car {
    private String name;
    private int price;
    private String owner;

    public Car() {
    }

    public Car(String name, int price, String owner) {
        this.name = name;
        this.price = price;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Car: " +
                "name = " + name +
                ", price = " + price +
                ", owner = " + owner;
    }
}
