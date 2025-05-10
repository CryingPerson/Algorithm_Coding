import java.io.*;
import java.util.*;

public class Main {
    static char[][] arr;
    static int[] dx = {-1, 0, 1, 0}; // 위, 오른, 아래, 왼 (x는 행)
    static int[] dy = {0, 1, 0, -1}; // 위, 오른, 아래, 왼 (y는 열)
    static int N, M;
    static ArrayList<ArrayList<Integer>> list;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

         N = sc.nextInt();
         M = sc.nextInt();
        arr = new char[N][M];
        sc.nextLine();
        for(int i = 0; i < N; i++) {
            char[] charArray = sc.nextLine().toCharArray();
            for(int j = 0; j < M; j++) {
                arr[i][j] = charArray[j];
            }
        }
        int answer = BFS(0, 0);
        System.out.println(answer);
    }
    public static int BFS(int x, int y){
        Queue<point> queue = new LinkedList<>();
        queue.add(new point(x, y));

        int cnt = 1;
        arr[x][y] = '0';
        while (!queue.isEmpty()){
            int size = queue.size();
            for(int j = 0; j < size; j++){
                point cur = queue.poll();

                if(cur.x == N-1 && cur.y == M-1) return cnt;
                for(int i = 0; i < 4; i++) {
                    int nx = cur.x + dx[i];
                    int ny = cur.y + dy[i];

                    if (nx < 0 || ny < 0 || nx >= N || ny >= M) continue;
                    if(arr[nx][ny] == '1'){
                        arr[nx][ny] = '0';
                        queue.add(new point(nx, ny));
                    }
                }
            }
            cnt++;
        }
        return cnt;
    }
}
class point {
    int x, y;
    public point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
