package study.example.chap03;

import java.util.Scanner;

public class BruteForce6064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();

        while(true) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int x = sc.nextInt()-1;
            int y = sc.nextInt()-1;

            boolean flag = false;

            for(int i=x; i<m*n; i+=m) {
                if(i%n == y) {
                    System.out.println(i+1);
                    cnt--;
                    flag = true;
                    break;
                }
            }
            if(!flag) {
                System.out.println("-1");
            }

            if(cnt == 1) {
                return;
            }
        }
    }
}
