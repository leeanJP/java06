package cahp12;

public class MathEx {
    public static void main(String[] args) {
        //큰 정수 또는 작은 정수 얻기

        double v1 = Math.ceil(5.3); // 올림 6
        double v2 = Math.floor(5.3); //버림 5

        //큰 값, 작은 값 얻기
        long v3 = Math.max(3,7);
        long v4 = Math.min(3,7);

        //소수 이하 두자리 얻기
        double value = 12.3456;
        double temp1 = value * 100;
        double temp2 = Math.round(temp1);
        double v5 = temp2/ 100.0;

    }
}
