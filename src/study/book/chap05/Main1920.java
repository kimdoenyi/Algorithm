package study.book.chap05;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * 이진탐색
 */
public class Main1920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] array = new int[N];
        for(int i=0; i<N; i++) {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);

        int M = sc.nextInt();   // 찾아야 할 숫자 갯수

        for(int i=0; i<M; i++) {
            boolean find = false;
            int target = sc.nextInt();
            int start = 0;
            int end = array.length-1;

            while(start <= end) {
                // 중앙값
                int mid = (start+end)/2;

                if(target > array[mid]) {
                    start = mid + 1;
                } else if(target < array[mid]) {
                    end = mid - 1;
                } else {
                    find = true;
                    break;
                }
            }

            if(find){
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }


    }
}
