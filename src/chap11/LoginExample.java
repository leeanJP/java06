package chap11;

public class LoginExample {
    public static void main(String[] args) {
        try {
            login("blue", "12345");
            System.out.println("로그인되었습니다.");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
            login("blue", "54321");

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void login(String id , String pwd) throws NoExitsIDException , WrongPasswordException{
        //id 가 blue가 아니라면 NoExitsIDException 발생
        if(!id.equals("blue")){
            throw new NoExitsIDException("아이디가 blue가 아닙니다");
        }
        //pwd 가 12345가 아니면 WrongPasswordException 발생
        if(!pwd.equals("12345")){
            throw new WrongPasswordException("패스워가 틀립니다.");
        }

    }
}
