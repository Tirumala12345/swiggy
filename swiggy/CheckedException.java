package swiggy;

public class CheckedException extends Exception{
    String code;

    public CheckedException(String code, String message) {
        super(message);
        this.code = code;
    }
}
