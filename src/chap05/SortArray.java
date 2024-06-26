package chap05;

import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] n = new int[10];

        System.out.println("정수 10개 입력 >> ");
        for(int i=0; i<n.length; i++) {
            n[i] = sc.nextInt();
        }

        //버블 정렬
        for(int i=0; i<n.length; i++){
            for(int j=i; j<n.length; j++){
                if(n[i] > n[j]){
                    int tmp = n[i];
                    n[i] = n[j];
                    n[j] = tmp;
                }
            }
        }

        for(int i : n){
            System.out.print( i + " ");
        }


    }
}
