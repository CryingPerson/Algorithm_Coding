import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();

    static int x,y;
    static int[][] board;
    static List<info> union;
    static boolean[][] visited;
    static int[] dx = {-1 ,0 ,1, 0};
    static int[] dy = {0, 1, 0, -1};
    static Map<List<Integer>, Integer> map;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        x = sc.nextInt(); y = sc.nextInt(); board = new int[x][y];
        union = new ArrayList<>();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int day = 0;
        while (true) {
            boolean end = false;

            visited = new boolean[x][y];
            map = new HashMap<>();
            DFS(0, 0);
            if (map.size() == 0) {
                end = true;
            }
            if(end) break;
            for (Map.Entry<List<Integer>, Integer> m : map.entrySet()) {
                if (m.getValue() >= 2) {
                    List<Integer> key = m.getKey();
                    board[key.get(0)][key.get(1)] = 0;
                }
            }
            day++;
        }
        System.out.println(day);
    }

    static void DFS(int ax, int ay) {
        visited[ax][ay] = true;
        for (int i = 0; i < 4; i++) {
            int nx = ax + dx[i];
            int ny = ay + dy[i];

            if(nx < 0 || ny < 0 || nx >= x || ny >= y) continue;

            if(visited[nx][ny]) continue;

            if(board[nx][ny] == 1){
                List<Integer> nx1 = List.of(nx, ny);
                map.put(nx1, map.getOrDefault(nx1, 0) + 1);
            }else{
                DFS(nx,ny);
            }
        }
    }
}
class info{
    int xxx;
    int yyy;

    public info(int xxx, int yyy) {
        this.xxx = xxx;
        this.yyy = yyy;
    }

    @Override
    public int hashCode() {
        return Objects.hash(xxx, yyy);
    }
}
