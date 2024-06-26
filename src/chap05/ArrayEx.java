package chap05;

import java.util.Arrays;

public class ArrayEx {
    public static void main(String[] args) {
        // 반 학생 성적
        int score1 = 90;
        int score2 = 95;
        int score3 = 60;
        int score30 = 90;

//        int sum = score1 + score2 + ..... score30;
        //배열의 기본 형태
        //JAVA에서는 같은 타입의 값만 배열에 넣을 수 있다.
        //배열의 길이는 늘리거나 줄일수 없다.
        int[] intArray;   //int intArray[]
        byte[] byteArr;
        String[] stringArr;
        //자료형[] 변수명
        //자료형 변수명[];

        //
        int[] intArray2 = {10, 20, 30, 40, 50 };
        String[] season = {"spring" , "summer" ,"fall", "winter"};

        System.out.println(season[1]);

        //배열의 특정 값 변경
        season[3] = "가을";
        System.out.println(season[3]);
        System.out.println(Arrays.toString(season));


        for(int i=0 ; i< season.length; i++){
            System.out.println(season[i]);
        }

        String[] season2;
        //season2  = {"spring" , "summer" ,"fall", "winter"};

        season2 = new String[] {"spring" , "summer" ,"fall", "winter"};
        System.out.println(season2[3]);

        //길이가 5인 배열을 생성할 때
        int[] intArray5 = new int[5];
        System.out.println(intArray5[3]);

        String[] strArr2 = new String[10];
        //{null , null,....}

    }
}
