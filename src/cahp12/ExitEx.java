package cahp12;

public class ExitEx {
    public static void main(String[] args) {

        for(int i=0; i<10; i++){
            System.out.println(i);
            if(i==5){
                System.exit(0);
            }
        }
        //0 : 정상종료 1 , -1 : 비정상종료
    }
}
