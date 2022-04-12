package study.book.chap03;

import java.util.Scanner;

/**
 * 투 포인터 전략
 */
public class Main2018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int start_index = 1;
        int end_index = 1;
        int sum = 1;
        int count = 1;  // 본인자신포함

        while(end_index != N) {

            if(sum == N) {
                count++;
                end_index++;
                sum = sum + end_index;
            }

            if(sum > N) {
                sum = sum - start_index;
                start_index++;
            }

            if(sum < N) {
                end_index++;
                sum = sum + end_index;
            }
        }
        System.out.println(count);
    }
}
