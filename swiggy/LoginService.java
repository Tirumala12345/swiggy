package swiggy;

public class LoginService {
    public String userName="abc@gmail.com";
    public String password="1234";

    public boolean loginValidate(String localUserName, String localPassword) {
        if (localUserName.equals(userName) && localPassword.equals(password)) {
            System.out.println("Login SuccessFull");
            return true;
        } else {
            System.out.println("Invalid Credentials");
             return false;
        }
    }
}
