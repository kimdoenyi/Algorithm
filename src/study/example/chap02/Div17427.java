package study.example.chap02;

import java.util.Scanner;

public class Div17427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum = 0;

        for(int i=1; i<=num; i++) {
            sum += (num/i)*i;
        }
        System.out.println(sum);
    }
}
