package chap06;

public class Computer {
    //가변길이 매개변수

    int sum(int ... values){
        //합계를 리턴할 sum 변수 선언
        int sum = 0;
        // values 배열 타입의 변수처럼 사용
        for(int value : values){
            sum += value;
        }
        //합산 결과를 리턴
        //return문은 메소드 실행을 강제 종료하고 호출한 곳으로 돌아간다.
        //메소드 선언에 리턴타입이 있는 경우 return문이 필수
        //return문 뒤에 작성된 코드는 Unreachable Code
        return sum;
        //System.out.println(sum);
    }

}
