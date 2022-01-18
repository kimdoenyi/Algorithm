package study.example.chap02;

import java.util.Scanner;

public class Div1037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();
        // 진짜 약수의 갯수만큼 배열생성
        int arr[] = new int[cnt];

        // 진짜 약수를 입력받음
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for(int i=0; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
            if(arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println(min*max);
    }
}
