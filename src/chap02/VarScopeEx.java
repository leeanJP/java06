package chap02;

public class VarScopeEx {
    public static void main(String[] args) {
        //변수 사용 범위

        int v1 = 10;

        if(v1 >5){

            int v2 = v1 -3 ;

        }
        //int v3 = v1 + v2;
    }
}
