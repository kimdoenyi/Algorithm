package study.example.chap02;

import java.util.Scanner;

public class GCD2609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcdRes = gcd(a, b);
        int lcm = a*b/gcdRes;

        System.out.println(gcdRes);
        System.out.println(lcm);
    }

    static int gcd(int a, int b) {
        if(b == 0) {
            return a;
        } else {
            // a,b 대소비교를 안해도되는 이유 -> 어차피 작은수%큰수=작은수가 되니까 ..
            return gcd(b, a%b);
        }
    }

}
