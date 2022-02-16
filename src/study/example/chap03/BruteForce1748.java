package study.example.chap03;

import java.util.Scanner;

public class BruteForce1748 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt(); // 15
        long ans = 0;
        
        for(int start=1, len=1; start<=num; start*=10, len++) {
            int end = start*10-1;

            if(end > num) {
                end = num;
            }
            ans += (long)(end - start + 1) * len;
        }
        System.out.println(ans);

    }
}
