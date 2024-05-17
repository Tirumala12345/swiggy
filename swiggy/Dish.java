package swiggy;

public class Dish {
    private final String dishName;
    private final double price;

    public Dish(String dishName, double price) {
        this.dishName = dishName;
        this.price = price;
    }

    public String getDishName() {
        return dishName;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "dishName='" + dishName + '\'' +
                ", price=" + price +
                '}';
    }
}
