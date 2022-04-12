package study.book.chap03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main11660 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken()); // 배열 크기
        int M = Integer.parseInt(stringTokenizer.nextToken()); // 합을 구해야하는 횟수

        long[][] array = new long[N+1][N+1];
        long[][] arraySum = new long[N+1][N+1];

        for(int i=1; i<=N; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for(int j=1; j<=N; j++) {
                array[i][j] = Integer.parseInt(stringTokenizer.nextToken());
                // 2차원 합 저장
                arraySum[i][j] = arraySum[i][j-1] + array[i][j];
            }
        }

        for(int i=1; i<=N; i++) {
            for(int j=1; j<=N; j++) {
                // 2차원 구간합 구하기 공식
                arraySum[i][j] = arraySum[i][j - 1] + arraySum[i - 1][j] - arraySum[i - 1][j - 1] + array[i][j];
            }
        }

        for(int i=0; i<M; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int x1 = Integer.parseInt(stringTokenizer.nextToken());
            int y1 = Integer.parseInt(stringTokenizer.nextToken());
            int x2 = Integer.parseInt(stringTokenizer.nextToken());
            int y2 = Integer.parseInt(stringTokenizer.nextToken());

            long result = arraySum[x2][y2] - arraySum[x1 - 1][y2] - arraySum[x2][y1 - 1] + arraySum[x1 - 1][y1 - 1];
            System.out.println(result);
        }
    }
}
