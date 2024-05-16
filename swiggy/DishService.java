package swiggy;

import java.util.function.Predicate;

public class DishService {
    public Dish findDish(Restaurant restaurant, String dishName) throws CheckedException {
        if (restaurant != null) {
            Predicate<Dish> dishPredicate = dish -> dish.getDishName().equalsIgnoreCase(dishName);
            return restaurant.getDishList().stream().filter(dishPredicate).findFirst().orElse(null);
        } else {
            throw new CheckedException(ErrorCodes.DISH_NOT_FOUND.getCode(),
                    ErrorCodes.DISH_NOT_FOUND.getMessage());
        }
    }
}