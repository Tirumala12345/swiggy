package swiggy;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private String restaurantName;
    private Address address;
    private List<Dish> dishList = new ArrayList<>();

    public Restaurant(String restaurantName, Address address) {
        this.restaurantName = restaurantName;
        this.address = address;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public Address getAddress() {
        return address;
    }

    public List<Dish> getDishList() {
        return dishList;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "restaurantName='" + restaurantName + '\'' +
                ", address=" + address +
                ", dishList=" + dishList +
                '}';
    }
}
