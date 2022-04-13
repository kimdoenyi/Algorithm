package study.book.chap06;

import java.io.IOException;
import java.util.Scanner;

public class Main11047 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] array = new int[N];

        for(int i=0; i<N; i++) {
            array[i] = sc.nextInt();
        }

        int count = 0;
        for(int i=N-1; i>=0; i--) {
            if(array[i] <= K) {
                count += (K / array[i]);
                K = K % array[i];
            }
        }

        System.out.println(count);
    }
}
