package swiggy;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Cart {
    private List<Dish> items = new ArrayList<>();

    public Consumer<Dish> addItem = items::add;
    public Supplier<List<Dish>> getItems = () -> items;

    @Override
    public String toString() {
        return "Cart{" +
                "items=" + items +
                '}';
    }

    public double getTotalPrice() {
        return items.stream().mapToDouble(Dish::getPrice).sum();
    }
}
