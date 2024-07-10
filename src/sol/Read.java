package sol;

public class Read {
    public static void main(String[] args) {
        String my_string = "ihrhbakrfpndopljhygc";
        int m = 4;
        int c = 2;

        String answer = "";

        //String 길이
        int length = my_string.length();
        //String의 길이에 따라서 my_string을 잘라 배열에 담기
        String[] str_arr;

        if(length%m == 0){
            str_arr = new String[length/m];
        }else {
            str_arr = new String[length/m +1];
        }

        for(int i=0, j=0; i<length; i+= m){
            if(i+m <= length){
                str_arr[j] = my_string.substring(i, i+m);
                j++;
            }else {
                str_arr[j] = my_string.substring(i);
                break;
            }
        }

        //str_arr = {"ihrh", "bakr", "fpnd", ...}
        //이렇게 담겨 있을것

        for(String s : str_arr){
            answer += s.charAt(c-1);
        }


        System.out.println(answer);
    }
}
