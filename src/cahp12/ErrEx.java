package cahp12;

public class ErrEx {
    public static void main(String[] args) {
        try {
            int value = Integer.parseInt("1oo");
        }catch (NumberFormatException e) {
            e.printStackTrace();
            System.err.println("[에러 내용]");
            System.err.println(e.getMessage());
        }
    }
}
