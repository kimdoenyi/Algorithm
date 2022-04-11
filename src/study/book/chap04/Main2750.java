package study.book.chap04;

import java.util.Scanner;

/**
 * 버블정렬
 */
public class Main2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int[] inputArray = new int[size];

        for(int i=0; i<size; i++) {
            inputArray[i] = sc.nextInt();
        }

        for(int i=0; i<size-1; i++) {   // 반복 횟수를 위한 반복문
            for(int j=0; j<size-1-i; j++) {     // swap 을 위한 반복문
                // 비교값은 다 j로 이용
                if(inputArray[j] > inputArray[j+1]) {
                    int temp = inputArray[j];
                    inputArray[j] = inputArray[j+1];
                    inputArray[j+1] = temp;
                }
            }
        }

        for(int i=0; i<size; i++) {
            System.out.println(inputArray[i]);
        }

    }
}
