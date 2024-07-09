package cahp12;

public class RuntimeEx {
    public static void main(String[] args) {
        //long currentTimeMills(); // ms 단위로 진행된 시간 리턴
        //long nanoTime(); //나노초 단위로 진행된 시간 리턴

        long time1 = System.currentTimeMillis();
        int sum = 0 ;

        for(int i=0; i<=1000000; i++){
            sum += i;
        }

        long time2 = System.currentTimeMillis();

        System.out.println("1 ~ 1000000까지의 합" + sum);
        System.out.println("계산에 " + (time2 - time1) + " 나노초가 소요되었습니다. ");

    }

}
