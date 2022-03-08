package study.example.chap04;

public class BruteForce15649 {
    public static void main(String[] args) {
        int n = 4;
        int m = 2;

        BruteForce15649.go(1, n, m);
    }
    // ㄷㅏ시 풀기
    public static void go(int idx, int n, int m) {
        boolean[] isUsed = new boolean[10]; // 해당 인덱스(위치)를 사용했는지 체크
        int[] result = new int[10];     // 수열

        if (idx == m) {
            for(int i=0; i< result.length; i++) {
                System.out.print(result[i] +" ");
                System.out.println("");
            }
            return;
        }

        for(int i=1; i<=n; i++) {
            if(isUsed[i]) {
                continue;
            }
            isUsed[i] = true;
            result[i] = i;
            go(idx+1, n, m);
            isUsed[i] = false;
        }
    }
}
