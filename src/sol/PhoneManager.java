package sol;

import java.util.Scanner;

class Phone{
    private String name;
    private String tel;

    public Phone(String name, String tel){
        this.name = name;
        this.tel = tel;
    }
    public String getName(){
        return name;
    }
    public String getTel(){
        return tel;
    }
}

public class PhoneManager {
    private Scanner sc;
    private Phone[] phones;

    public PhoneManager() {
        sc = new Scanner(System.in);
    }

    private void read(){
        System.out.println("인원수 >> ");
        int n = sc.nextInt();

        phones = new Phone[n]; //n명의 데이터를 저장할 배열 선언

        for (int i = 0; i < n; i++) {
            System.out.println("이름과 전화번호(번호는 연속적으로 입력) >>");
            String name = sc.next();
            String tel = sc.next();
            phones[i] = new Phone(name, tel);
        }
        System.out.println("저장 되었습니다...");

    }

    private String search(String name){
        for(int i = 0; i < phones.length; i++){
            if(phones[i].getName().equals(name)){
                return phones[i].getTel();
            }
        }
        return null;
    }

    public void run(){
        read();
        while (true){
            System.out.println("검색할 이름 >>>");
            String name = sc.next();
            if(name.equals("exit")){
                break;
            }
            String tel = search(name);

            if(tel == null){
                System.out.println(name + "이/가 없습니다.");
            }else {
                System.out.println(name +" 의 번호는 " + tel + "입니다.");
            }
        }
        System.out.println("프로그램을 종료합니다.");
    }

    public static void main(String[] args) {
        new PhoneManager().run();
    }


}
