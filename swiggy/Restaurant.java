package swiggy;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    public String restaurantName;
    public Address address;
    public List<Dish> dishList=new ArrayList<>();

    public Restaurant(String restaurantName, Address address) {
        this.restaurantName = restaurantName;
        this.address = address;
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

    public String getRestaurantName() {
        return restaurantName;
    }

    public Address getAddress() {
        return address;
    }
}
