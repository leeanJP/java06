package chap11;

public class InsuffiecientException extends Exception {
    public InsuffiecientException() {
    }

    //예외 객체 공통 메소드 getMessage의 리턴값으로 사용하기 위함
    public InsuffiecientException(String message) {
        super(message);
    }
}
