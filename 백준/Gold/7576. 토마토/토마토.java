import java.util.*;
import java.util.function.DoubleConsumer;

public class Main {
    static int[] arr = new int[3];
    static int x,y;
    static int[][] tomato;
    static boolean[][] visited;
    static List<int[]> point = new LinkedList<>();
    static int[] dx = {-1 , 0 , 1, 0};
    static int[] dy = {0, 1, 0, -1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        x = sc.nextInt(); y = sc.nextInt(); tomato = new int[y][x];

        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                tomato[i][j] = sc.nextInt();
                if(tomato[i][j] == 1){
                    point.add(new int[]{i,j});
                }
            }
        }

        int bfs = 0;
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                if(tomato[i][j] == 0){
                    bfs = BFS();
                }
            }
        }

        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                if (tomato[i][j] == 0) {
                    System.out.println(-1);
                    return;
                }
            }
        }
        System.out.println(bfs);
    }

    static int BFS() {
        Queue<int[]> possbliePoint = new LinkedList<>();

        for(int[] ss : point) possbliePoint.add(ss);

        int count = 0;
        while (!possbliePoint.isEmpty()) {
            int size = possbliePoint.size();

            int sibal = 0;
            for (int i = 0; i < size; i++) {
                int[] pos = possbliePoint.poll();

                int cx = pos[0];
                int cy = pos[1];

                for (int j = 0; j < 4; j++) {
                    int nx = dx[j] + cx;
                    int ny = dy[j] + cy;

                    if(nx < 0 || ny < 0 || nx >= tomato.length || ny >= tomato[0].length) continue;
                    if(tomato[nx][ny] == -1) continue;

                    if(tomato[nx][ny] == 0){
                        tomato[nx][ny] = 1;
                        possbliePoint.add(new int[]{nx,ny});
                        sibal++;
                    }
                }

            }
            if(sibal == 0) return count;
            count++;
        }
        return count;
    }
}
