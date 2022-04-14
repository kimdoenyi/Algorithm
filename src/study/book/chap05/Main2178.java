package study.book.chap05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * 최단경로 : BFS , 인접 ,, 등등
 *
 * 1. 배열 생성
 * 2. 방문여부 배열 생성
 * 3. BFS 탐색
 */
public class Main2178 {
    // 상하좌우 탐색을 위한 배열
    static int[] dx = {0 , 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    static int[][] array;
    static boolean[][] isVisited;

    static int N;
    static int M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        // 미로 생성
        array = new int[N][M];

        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            String line = st.nextToken();
            for(int j=0; j<M; j++) {
                array[i][j] = Integer.parseInt(line.substring(j, j+1));
            }
        }

        // 방문 배열 초기화
        isVisited = new boolean[N][M];
        BFS(0,0);
        System.out.println(array[N-1][M-1]);
    }

    static void BFS(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {x, y});

        while(!queue.isEmpty()) {
            int now[] = queue.poll();
            isVisited[x][y] = true;

            // 상하좌우
            for(int i=0; i<4; i++) {
                int px = now[0] + dx[i];
                int py = now[1] + dy[i];
                // 좌표 유효성 체크
                if(px >= 0 && py >= 0 && x < N && y < M) {
                    if(array[px][py] != 0 && !isVisited[px][py]) {
                        isVisited[px][py] = true;
                        array[px][py] = array[now[0]][now[1]]+1;    // 깊이 업데이트
                        queue.add(new int[] {px, py});
                    }
                }
            }
        }

    }
}
