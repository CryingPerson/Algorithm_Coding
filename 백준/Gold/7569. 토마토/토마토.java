import java.util.*;
import java.util.function.DoubleConsumer;

public class Main {
    static int[] arr = new int[3];
    static int x,y,z;
    static int[][][] tomato;
    static boolean[][] visited;
    static List<int[]> point = new LinkedList<>();
    static int[] dx = {-1 , 0 , 1, 0};
    static int[] dy = {0, 1, 0, -1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        x = sc.nextInt(); y = sc.nextInt(); z = sc.nextInt(); tomato = new int[z][y][x];

        for (int t = 0; t < z; t++) {
            for (int i = 0; i < y; i++) {
                for (int j = 0; j < x; j++) {
                    tomato[t][i][j] = sc.nextInt();

                    if(tomato[t][i][j] == 1){
                        point.add(new int[]{t,i,j});
                    }
                }
            }
        }

        int bfs = 0;
        for (int t = 0; t < z; t++) {
            for (int i = 0; i < y; i++) {
                for (int j = 0; j < x; j++) {
                    if(tomato[t][i][j] == 0){
                        bfs = BFS();
                    }
                }
            }
        }


        for (int t = 0; t < z; t++) {
            for (int i = 0; i < y; i++) {
                for (int j = 0; j < x; j++) {
                    if(tomato[t][i][j] == 0){
                        System.out.println(-1);
                        return;
                    }
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

                int cx = pos[1];
                int cy = pos[2];
                int ch = pos[0];

                for (int j = 0; j < 4; j++) {
                    int nx = dx[j] + cx;
                    int ny = dy[j] + cy;

                    if(nx < 0 || ny < 0 || nx >= y || ny >= x) continue;
                    if(tomato[ch][nx][ny] == -1) continue;

                    if(tomato[ch][nx][ny] == 0){
                        tomato[ch][nx][ny] = 1;
                        possbliePoint.add(new int[]{ch,nx,ny});
                        sibal++;
                    }
                }
                int updh = ch + 1;
                int downdh = ch - 1;

                if(cx < 0 || cy < 0 || cx >= y || cy >= x) continue;

                if(updh < z && tomato[updh][cx][cy] == 0){
                    tomato[updh][cx][cy] = 1;
                    possbliePoint.add(new int[]{updh,cx,cy});
                }
                if(downdh < 0) continue;

                if(tomato[downdh][cx][cy] == 0){
                    tomato[downdh][cx][cy] = 1;
                    possbliePoint.add(new int[]{downdh,cx,cy});
                }

            }
            count++;
        }
        return count - 1;
    }
}
