package swiggy;

import java.util.ArrayList;
import java.util.List;

public class Swiggy {
    private List<Restaurant> restaurants = new ArrayList<>();

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }

    public void addRestaurant(Restaurant restaurant) {
        restaurants.add(restaurant);
    }
}
