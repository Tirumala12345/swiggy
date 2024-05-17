package swiggy;

import java.util.function.Supplier;

public class RestaurantService {
    public Supplier<Restaurant> findRestaurant(Swiggy swiggy, String restaurantName) {
        return () -> swiggy.getRestaurants().stream()
                .filter(restaurant -> restaurant.getRestaurantName().equalsIgnoreCase(restaurantName))
                .findFirst().orElse(null);
    }
}
