package study.book.chap03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 합배열 , 구간합구하기
 *
 * 문자열 여러개를 입력받을땐 nextInt 를 쓰면 비효율적임
 * BufferedReader 사용해서 읽기
 *
 */
public class Main11659 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 수의 갯수
        int m = Integer.parseInt(st.nextToken()); // 합을 구해야하는 횟수
        
        long[] S = new long[n+1];

        // 엔터치면 오류나서 새로 생성해줘야함
        st = new StringTokenizer(br.readLine());
        // 입력과 동시에 합배열 만들기
        for(int i=1; i<=n; i++) {
            S[i] = S[i-1] + Integer.parseInt(st.nextToken());
        }

        // 입력과 동시에 구간합 저장
        for(int j=0; j<m; j++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            System.out.println(S[y] - S[x-1]);
        }
    }
}
