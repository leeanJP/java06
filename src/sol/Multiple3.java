package sol;

import java.util.Scanner;

public class Multiple3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] n = new int[10];

        System.out.println("정수 10개 입력 >> ");
        for(int i=0; i<n.length; i++) {
            n[i] = sc.nextInt();
        }

        for(int i=0; i<n.length; i++){
            if(n[i] %3 == 0){
                System.out.print(n[i] + " ");
            }
        }
        sc.close();



    }
}
