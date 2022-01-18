package study.example.chap02;

import java.util.Scanner;

public class Mod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextInt()) {
            int n = sc.nextInt(); // 입력받은값, 계속 나눠줄 값
            int num = 0;

            for(int i=1; ; i++) {
                num = num*10+1;
                num %= n;

                if(num == 0){
                    System.out.println("i = " + i);
                    break;
                }
            }
        }

    }
}
