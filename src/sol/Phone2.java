package sol;

import java.util.Scanner;

public class Phone2 {
    private String name, tel;

    public Phone2(String name, String tel) {
        this.name = name;
        this.tel = tel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("이름과 전화번호 입력 >>");
        String name = sc.next();
        String tel = sc.next();

        Phone2 a = new Phone2(name, tel);
        System.out.println("이름과 전화번호 입력 >>");
        name = sc.next();
        tel = sc.next();

        Phone2 b = new Phone2(name, tel);

        System.out.println(a.getName() + "의 번호 " + a.getTel());
        System.out.println(b.getName() + "의 번호 " + b.getTel());

        sc.close();
    }
}
