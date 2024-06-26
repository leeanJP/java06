package chap05;

public class ArrayEx2 {
    public static void main(String[] args) {
        //배열 변수 선언 배열 생성
        int[] arr1 = new int[3];

        //배열 항목의 초기값 출력
        for(int i=0; i<arr1.length; i++){
            System.out.println("arr 초기값 출력"+arr1[i]);
        }

        //배열 항목의 값 변경
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
//        arr1[3] = 40;
        //배열항목의 변경된 값 출력
        for(int i=0; i<arr1.length; i++){
            System.out.println("arr 변경값 출력"+arr1[i]);
        }

        //String 배열 선언 배열 생성
        String[] arr2 = new String[3];

        //배열 항목의 초기값 출력
        for(int i=0; i<arr2.length; i++){
            System.out.println("arr 초기값 출력"+arr2[i]);

            //배열의 각 항목의 값 변경
            arr2[i] = (i+1) + "월";
        }
        for(int i=0; i<arr2.length; i++) {
            System.out.println("arr 변경값 출력" + arr2[i]);

        }


        }
}
