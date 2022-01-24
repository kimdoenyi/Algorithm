package study.example.chap02;

import java.util.ArrayList;
import java.util.Scanner;

public class Prime1978 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();
        int arr[] = new int[cnt];

        for(int i=0; i<cnt; i++) {
            arr[i] = sc.nextInt();
            for(int j=2; j*j<arr[i]; i++) {
                if(arr[i] % j == 0){

                }
            }
        }

    }
}
