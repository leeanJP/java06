package chap05;

public class ArrayEx3 {
    public static void main(String[] args) {
        int[] intArr = new int[3];  //{0,0,0}
        int[][] scores = {
                {80,60,70}, //1반
                {90,80,70,60}  //2반
        };

        System.out.println("1차원 배열 길이(반의 수) : "  + scores.length);
        System.out.println("2차원 배열 길이(첫번째 반의 학생 수) " + scores[0].length) ;
        System.out.println("2차원 배열 길이(두번째 반의 학생 수) " + scores[1].length) ;

        //첫 번째 반 세번째 학생의 점수
        System.out.println(scores[0][2]);
        //두 번째 반의 두번째 학생의 점수
        System.out.println(scores[1][1]);

        //각반의 점수 합계와 평균

        int class1Sum = 0;
        int class2Sum = 0;

        for(int i=0; i<scores[0].length; i++){
            class1Sum += scores[0][i];
        }

        for(int i=0; i<scores[1].length; i++){
            class2Sum += scores[1][i];
        }

        double class1Avg = (double) class1Sum / scores[0].length;
        double class2Avg = (double) class1Sum / scores[1].length;

        System.out.println("첫번째 반의 평균 점수 : " + class1Avg );
        System.out.println("두번째 반의 평균 점수 : " + class2Avg );


    }
}
