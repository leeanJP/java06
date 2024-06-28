package chap07;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        int[] answer = new int[arr.length-1];
        int min = arr[0];
        int removeIndex =0;

        if(arr.length == 0 || arr.length ==1) {
            answer = new int[1];
            answer[0] = -1;
        }else {
            for(int i=1; i<answer.length+1; i++){
                if(min > arr[i]){
                    min = arr[i];
                    removeIndex = i;
                }
            }

            //값 복사
            for(int i=0, j=0; i<arr.length; i++){
                if(i != removeIndex){
                    answer[j] = arr[i];
                    j++;
                }
            }
        }

        System.out.println(removeIndex);
        System.out.println(Arrays.toString(answer));
    }
}
