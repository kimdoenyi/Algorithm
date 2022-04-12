package study.book.chap05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * DFS 보충
 */
public class Main1260 {
    static ArrayList<Integer>[] list;
    static boolean[] isVisited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int node = Integer.parseInt(st.nextToken());    // 정점의 갯수 : 4
        int line = Integer.parseInt(st.nextToken());    // 간선의 갯수 : 5
        int startNode = Integer.parseInt(st.nextToken()); // 시작점 : 1

        // 인접리스트 생성
        list = new ArrayList[node+1];

        // 인접리스트 각각 노드 초기화
        for(int i=1; i<=node; i++) {
            list[i] = new ArrayList<Integer>();
        }

        // 인접리스트 생성
        for(int i=0; i<line; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            // 양방향
            list[x].add(y);
            list[y].add(x);
        }
        // 정렬
        for(int i=1; i<=node; i++) {
            Collections.sort(list[i]);
        }

        // DFS 방문 체크 배열 생성
        isVisited = new boolean[node+1];
        DFS(startNode);
        System.out.println("");
        // BFS 방문 체크 배열 생성
        isVisited = new boolean[node+1];
        BFS(startNode);

    }

    static void DFS(int idx) {
        System.out.print(idx);
        System.out.print(" ");
        // 이미 방문했으면 return
        if(isVisited[idx]) {
            return;
        }
        isVisited[idx] = true;

        for(int i : list[idx]) {
            if(!isVisited[i]) {
                DFS(i);
            }

        }
    }

    /**
     * queue 는 offer 로 넣고 poll 로 뺀다
     * add 는 큐에 끝에 값 추가 -> 큐가 꽉차면 에러발생
     * @param idx
     */
    static void BFS(int idx) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(idx);
        isVisited[idx] = true;

        while(!queue.isEmpty()) {
            int now_Node = queue.poll();   // 큐에서 빼기

            System.out.print(now_Node+" ");

            for(int i : list[now_Node]) {
                if(!isVisited[i]) {
                    isVisited[i] = true;
                    queue.add(i);
                }
            }
        }
    }
}
