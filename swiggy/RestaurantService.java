package swiggy;

import java.util.function.Supplier;

public class RestaurantService {
    Supplier<Restaurant> findRestaurant(Swiggy swiggy,String restaurantName){
        return () -> {
            for (Restaurant restaurant : swiggy.getRestaurants()) {
                if (restaurant.getRestaurantName().equalsIgnoreCase(restaurantName)) {
                    return restaurant;
                }
            }
            return null;
        };
    }
}
