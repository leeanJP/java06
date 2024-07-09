package cahp12;

import java.util.Properties;
import java.util.Set;

public class GetPropertyEx {
    //시스템 프로퍼티 System Property
    //자바 프로그램이 시작될때 자동 설정되는 시스템 속성

    public static void main(String[] args) {
        String osName =  System.getProperty("os.name");     //운영체제
        String userName =  System.getProperty("user.name"); //사용자 이름
        String userHome =  System.getProperty("user.home"); //사용자 홈 디렉토리 경로
        System.out.println(osName);
        System.out.println(userName);
        System.out.println(userHome);

        System.out.println("----------------");
        System.out.println(" key  : value ");
        System.out.println("----------------");
        Properties props = System.getProperties();
        Set keys = props.keySet(); // {"os.name", "user.home"....}
        for (Object objKey : keys){
            String key = (String) objKey;
            String value = System.getProperty(key);
            System.out.printf("%-40s : %s\n" , key,  value );
        }


    }

}
