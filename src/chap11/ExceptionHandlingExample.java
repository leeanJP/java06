package chap11;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String[] array = {"100",  "1oo", null, "200"};

        for(int i=0; i<= array.length; i++){
            try {
                int value = Integer.parseInt(array[i]);
                System.out.println("array [" + i + "] : " + value);
            }catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("배열 인덱스 초과됨 : " + e.getMessage());
            }catch (NumberFormatException | NullPointerException e){
                System.out.println("데이터에 문제가있음 :" +e.getMessage() );
            }catch (Exception e){
                System.out.println("실행에 오류가 있습니다.");
            }

        }
    }
}
