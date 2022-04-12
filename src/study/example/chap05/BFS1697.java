package study.example.chap05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 수빈 -> 동생 최단시간구하기
 */
public class BFS1697 {
    public static final int MAX = 1000000;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // 수빈이가 있는 위치
        int m = sc.nextInt();   // 동생위치
        boolean[] check = new boolean[MAX]; // 해당 위치를 방문했는지 체크
        int[] dist = new int[MAX];  // 거리

        check[n] = true;
        dist[n] = 0;

        Queue<Integer> q = new LinkedList<Integer>();
        q.add(n);

        while (!q.isEmpty()) {
            int now = q.remove();
            if (now-1 >= 0) {
                if (check[now-1] == false) {    // 초기값 , 방문안한경우
                    q.add(now-1);
                    check[now-1] = true;
                    dist[now-1] = dist[now] + 1;
                }
            }
            if (now+1 < MAX) {
                if (check[now+1] == false) {
                    q.add(now+1);
                    check[now+1] = true;
                    dist[now+1] = dist[now] + 1;
                }
            }
            if (now*2 < MAX) {
                if (check[now*2] == false) {
                    q.add(now*2);
                    check[now*2] = true;
                    dist[now*2] = dist[now] + 1;
                }
            }
        }
        System.out.println(dist[m]);
    }
}
