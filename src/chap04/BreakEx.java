package chap04;

public class BreakEx {
    public static void main(String[] args) {

        //while 문에서 break 사용
//        while (true){
//            int num = (int) (Math.random()*6) + 1;
//            System.out.println(num);
//
//            if(num == 6) {
//                break;
//            }
//        }

        Outter: for(char upper = 'A'; upper <='Z'; upper++){
            for(char lower='a'; lower<= 'z'; lower++){
                System.out.println(upper + " - " + lower);

                if(lower == 'g'){
                    break Outter;
                }
            }
        }
        System.out.println("프로그램 종료");

    }
}
