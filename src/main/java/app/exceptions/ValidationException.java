package app.exceptions;

public class ValidationException extends Exception {
    private String wrongInputData;

    public ValidationException(String message) {
        super(message);
        wrongInputData = message;
    }

    @Override
    public String toString() {
        String s = "Entered data: " + wrongInputData + " is not valid";
        return s;
    }
}
