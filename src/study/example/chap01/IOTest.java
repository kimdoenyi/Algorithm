package study.example.chap01;

import java.util.Scanner;

/**
 * 입출력
 * Scanner 를 사용해서 입출력을 하고 , 문자열이 길어지면 StringBuilder 를 사용하자
 *
 * 백준 : 1000번
 */

public class IOTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a+b);
    }
}
