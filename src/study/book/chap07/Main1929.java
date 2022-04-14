package study.book.chap07;

import java.util.Scanner;

public class Main1929 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();
        int[] array = new int[N+1];

        for(int i=2; i<=N; i++) {
            array[i] = i;
        }

        for(int i=2; i<=Math.sqrt(N); i++) {
            if(array[i] == 0){
                continue;
            }
            for(int j = i+i; j<=N; j=j+i) {
                array[j] = 0;
            }
        }

        for(int i=1; i<=N; i++) {
            if(array[i] != 0){
                System.out.println(array[i]);
            }
        }
    }
}

