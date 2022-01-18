package study.example.chap01;

import java.util.Scanner;

/**
 * 입력이 몇개인지 주어지지않는 경우에는 입력을 EOF 까지 받으면 됨
 * while(sc.hasNextInt()) 사용
 */
public class MultiTestCase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextInt()) {
            int a,b;
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println(a+b);
        }
    }
}
