package chap04;

public class ForEx {
    public static void main(String[] args) {
        //for 반복문
        //기본 형태
        //js let
        int sum = 0;
        //for문 에서 선언된 i는 스코프가 블록 내부로 제한된다.
        //가비지 콜렉터 gc
        //자바에서는 더이상 사용되지 않는 메모리 영역을 자동으로 회수한다.
        //for 루프가 종료되면 i에 대한 참조는 사라져서 메모리에서 제거된다.
        for(int i=1; i<= 100 ; i++){
            sum = sum + i; // 1~ 100까지의 합
        }

        System.out.println(sum);

        for(int i=2; i<=9; i++){
            System.out.println("=== " +  i + "단 ===");
            for(int j=1; j<=9; j++){
                System.out.println(i + " X " + j +" = " + (i*j));
            }
        }

    }
}
