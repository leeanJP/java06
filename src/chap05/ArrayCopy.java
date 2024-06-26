package chap05;

public class ArrayCopy {
    public static void main(String[] args) {

        //배열의 길이를 조절하고 싶을때에는 새로운 배열을 생성하고 기존배열을 새로운배열에 복사한다.
        int[] oldIntArr = {1,2,3};
        //길이 5인 배열을 새로 생성
        int[] newIntArr = new int[5];

        //arrayCopy
        System.arraycopy(oldIntArr , 0, newIntArr , 0 , oldIntArr.length);
                        //원본 배열     //원본배열 시작인덱스                //복사 항목 수
                                                //복사할 새배열 //새배열에 붙여넣기 시작인데스


//        for(int i=0; i<oldIntArr.length; i++){
//            newIntArr[i] = oldIntArr[i];
//
//        }
//
        for(int i=0; i<newIntArr.length; i++) {
            System.out.println(newIntArr[i]);

        }
    }
}
