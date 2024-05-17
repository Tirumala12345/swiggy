package swiggy;

public enum ErrorCodes {
    DISH_NOT_FOUND("1001", "Dish Not Found"),
    INSUFFICIENT_BALANCE("1002", "Insufficient Balance");

    private final String code;
    private final String message;

    ErrorCodes(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
