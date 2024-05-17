package swiggy;

public class LoginService {
    private final String userName = "abc@gmail.com";
    private final String password = "1234";

    public boolean loginValidate(String localUserName, String localPassword) {
        if (localUserName.equals(userName) && localPassword.equals(password)) {
            System.out.println("Login Successful");
            return true;
        } else {
            System.out.println("Invalid Credentials");
            return false;
        }
    }
}
