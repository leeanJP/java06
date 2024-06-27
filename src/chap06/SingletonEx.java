package chap06;

public class SingletonEx {
    public static void main(String[] args) {
//        Singleton obj = new Singleton();

        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        // 동일한 객체를 참조하는지 확인
        if(singleton == singleton2){
            System.out.println("Singletons are equal");
        }else {
            System.out.println("Singletons are not equal");
        }

    }
}
