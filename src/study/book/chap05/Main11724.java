package study.book.chap05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main11724 {
    static ArrayList<Integer>[] A;  // 인접리스트
    static boolean isVisited[]; // 방문 여부 체크

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int node = Integer.parseInt(st.nextToken());    // 노드의 갯수
        int line = Integer.parseInt(st.nextToken());    // 간선의 갯수

        A = new ArrayList[node+1];
        isVisited = new boolean[node+1];

        // 인접리스트 초기화 -> 안하면 널포인터익셉션남
        for(int i=1; i<=node; i++) {
            A[i] = new ArrayList<Integer>();
        }

        for(int i=0 ;i<line; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            // 양방향 엣지 인접리스트 저장
            A[x].add(y);
            A[y].add(x);
        }

        for(int i=0; i<A.length; i++) {
            System.out.println("A["+i+"] :: " +A[i]);
        }


        int count = 0;
        for(int i=1; i<=node; i++) {
            if(!isVisited[i]) {
                // 횟수
                count++;
                DFS(i);
            }
        }

        System.out.println(count);
    }

    // DFS 재귀함수
    static void DFS(int v) {
        if(isVisited[v]) {
            return;
        }

        isVisited[v] = true;

        for(int i : A[v]) {
            if(isVisited[i] == false) {
                DFS(i);
            }
        }
    }
}
