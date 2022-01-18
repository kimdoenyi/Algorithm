package study.example.chap02;

public class Divisor {
    public static void main(String[] args) {
        // O(N) 방법
        int n = 24;
        System.out.println("약수는 ");
        for(int i=1; i<n; i++) {
            if(n % i == 0){
                System.out.print(i+" ");
            }

        }
    }
}
