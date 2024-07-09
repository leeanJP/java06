package cahp12;

public class Member {
    public String id;

    public Member(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        //obj가 Member타입인지 확인하고 타입 변환 후 target 변수에 대입
        if(obj instanceof Member  target) {
            if(id.equals(target.id)){
                return true;
            }
        }
        return false;


    }

    public static void main(String[] args) {
        Member obj1 = new Member("blue");
        Member obj2 = new Member("blue");
        Member obj3 = new Member("red");

        if(obj1.equals(obj2)){
            System.out.println("obj1 과 obj2 동일");
        }else {
            System.out.println("obj1 과 obj2 동일 X");
        }

        if(obj1.equals(obj3)){
            System.out.println("obj1 과 obj3 동일");
        }else {
            System.out.println("obj1 과 obj3 동일 X");
        }


    }
}
