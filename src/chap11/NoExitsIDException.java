package chap11;

public class NoExitsIDException extends Exception {
    public NoExitsIDException() {
    }

    public NoExitsIDException(String message) {
        super(message);
    }
}
