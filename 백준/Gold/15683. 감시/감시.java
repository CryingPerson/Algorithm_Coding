import java.util.*;

public class Main {
    static List<int[]> cctv = new ArrayList<>();
    static int[][] dir = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};

    static int[][][] point = {{{0}, {1}, {2}, {3}}, {{0, 2}, {1, 3}}, {{0, 1}, {1, 2}, {2, 3}, {3, 0}},
            {{0, 1, 2}, {1, 2, 3},{2,3,0}, {3, 0, 1}}, {{0, 1, 2, 3}}};

    static int min = Integer.MAX_VALUE;

    static int x,y;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         x = sc.nextInt();
         y = sc.nextInt();

        int[][] board = new int[x][y];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                board[i][j] = sc.nextInt();
                if (board[i][j] != 6 && board[i][j] != 0) {
                    cctv.add(new int[]{i, j});
                }
            }
        }

        DFS(0, board);

        System.out.println(min);

    }

    static void DFS(int depth, int[][] map) {
        if (depth == cctv.size()) {
            min = Math.min(min, check(map));
            return;
        }
        int[] place = cctv.get(depth);

        int xx = place[0];
        int yy = place[1];

        for(int[] po : point[map[xx][yy] - 1]){
            int[][] temp = copy(map);
            for(int num : po){
                watch(num,xx,yy, temp);
            }
            DFS(depth + 1, temp);
        }

    }

    static int[][] copy(int[][] map) {
        int[][] temp = new int[map.length][map[0].length];

        for (int i = 0; i < map.length; i++) {
            temp[i] = map[i].clone();
        }

        return temp;
    }

    static void watch(int d, int xx, int yy, int[][] map) {

        int[] dxy = dir[d];

        while (true) {
            int nx = xx + dxy[0];
            int ny = yy + dxy[1];

            if(nx < 0 || ny < 0 || nx >= x || ny >= y) break;
            if(map[nx][ny] == 6) break;
            if(map[nx][ny] == 0) map[nx][ny] = -1;
            xx = nx;
            yy = ny;
        }
    }

    static int check(int[][] map) {
        int count = 0;

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j] == 0) count++;
            }
        }
        return count;
    }
}

