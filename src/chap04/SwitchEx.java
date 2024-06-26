package chap04;

public class SwitchEx {
    public static void main(String[] args) {
        //기본형태

        int var1 = 0;
//        switch (var1) {
//            case 값1:
//                var1의 값이 값1일때 실행 할 코드~~~;
//                break;
//            case 값2:
//                var1의 값이 값2일때 실행 할 코드~~~;
//                break;
//            default:
//                var1이 값1,값2 모두 아닐경우 실행할 코드~~;
//
//        }

        int num = (int) (Math.random()*6) +1; // 값 1~6

        switch (num){
            case 1 :
                System.out.println("주사위 1 나옴");
                break;
            case 2 :
                System.out.println("주사위 2 나옴");
                break;
            case 3 :
                System.out.println("주사위 3 나옴");
                break;
            case 4 :
                System.out.println("주사위 4 나옴");
                break;
            case 5 :
                System.out.println("주사위 5 나옴");
                break;
            case 6 :
                System.out.println("주사위 6 나옴");


        }


    }
}
