package swiggy;

public class Dish {
    public String dishName;

    public double price;

    public Dish(String dishName, double price) {
        this.dishName = dishName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "dishName='" + dishName + '\'' +
                ", price=" + price +
                '}';
    }

    public String getDishName() {
        return dishName;
    }

    public double getPrice() {
        return price;
    }
}
