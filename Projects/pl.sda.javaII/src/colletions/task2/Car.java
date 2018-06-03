package colletions.task2;

public class Car {
    private String name;
    private int price;

    public Car(String name, int price) {
        setPrice(price);
        this.name = name;
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
        if (price > 0){
            this.price = price;
        }
    }

    @Override
    public String toString() {
        return "\nCar{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
