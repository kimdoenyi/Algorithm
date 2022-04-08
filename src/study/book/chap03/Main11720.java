package study.book.chap03;

import java.util.Scanner;

/**
 * 백준 11720번
 *
 */
public class Main11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputCount = sc.nextInt();
        String num = sc.next();
        char[] numToArray = num.toCharArray(); // 문자열을 char 타입의 배열로 저장해줌
        int sum = 0;

        for(int i=0; i<numToArray.length; i++) {
            sum += Integer.parseInt(Character.toString(numToArray[i]));
        }

        System.out.println(sum);
    }
}
