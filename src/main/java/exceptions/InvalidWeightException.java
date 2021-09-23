package exceptions;

public class InvalidWeightException extends Exception{
    String msg = "Invalid wight. Input > 0";

    @Override
    public String getMessage() {
        return msg;
    }
}
