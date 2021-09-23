package exceptions;

public class InvalidFutureTravel extends Exception{
    String msg = "Travel failed. Try get more speed. Make the engine more powerful or reduce the weight";

    @Override
    public String getMessage() {
        return msg;
    }
}
