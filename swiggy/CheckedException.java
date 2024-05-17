package swiggy;

public class CheckedException extends Exception {
    private final String code;

    public CheckedException(String code, String message) {
        super(message);
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
