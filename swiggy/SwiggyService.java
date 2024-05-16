package swiggy;

import java.util.ArrayList;
import java.util.List;

public class SwiggyService {
    public void orderProcess() throws CheckedException {
        Swiggy swiggy = new Swiggy();
        RestaurantService restaurantService=new RestaurantService();
        DishService dishService=new DishService();

        Dish dish1 = new Dish("Chicken", 160.0);
        Dish dish2 = new Dish("Mutton", 220.0);
        Dish dish3 = new Dish("Biryani", 120.0);

        Address address1 = new Address("408", "kphb", "hyd", "500066");
        Restaurant restaurant1 = new Restaurant("Meridian", address1);

        restaurant1.dishList.add(dish1);
        restaurant1.dishList.add(dish2);
        restaurant1.dishList.add(dish3);

        Address address2 = new Address("306", "Madhapur", "hyd", "500084");
        Restaurant restaurant2 = new Restaurant("Pista House", address2);

        restaurant2.dishList.add(dish1);
        restaurant2.dishList.add(dish2);
        restaurant2.dishList.add(dish3);

        swiggy.addRestaurant(restaurant1);
        swiggy.addRestaurant(restaurant2);

        String restaurantName = "Meridian";
        String[] dishNames = {"chicken","Biryani"};

        PaymentService paymentService=new PaymentService();
        LoginService loginService = new LoginService();
        boolean loginStatus = loginService.loginValidate("abc@gmail.com", "1234");

        if(loginStatus) {
            System.out.println("Login Success Full");
            Restaurant foundRestaurant = restaurantService.findRestaurant(swiggy, restaurantName).get();
            if (foundRestaurant != null) {
                Cart cart = new Cart();
                for (String dishName : dishNames){
                    Dish orderedDish=dishService.findDish(foundRestaurant,dishName);
                    if(orderedDish!=null){
                        cart.addItem.accept(orderedDish);
                        System.out.println("Ordered " + orderedDish.dishName + " from " + foundRestaurant.getRestaurantName() +
                                " located at " + foundRestaurant.getAddress() +
                                " for Rs:" + orderedDish.price);
                    }else{
                        throw new CheckedException(ErrorCodes.DISH_NOT_FOUND.getCode(), ErrorCodes.DISH_NOT_FOUND.getMessage());
                    }
                }
                System.out.println("Items added to cart: " + cart.getItems.get());
                System.out.println("Total Price: " + cart.getTotalPrice());
                paymentService.paymentProcess(cart.getTotalPrice(), "CreditCard");
            }
        }
    }

    public static void main(String[] args) throws CheckedException {
        SwiggyService service=new SwiggyService();
        service. orderProcess();
    }
}
