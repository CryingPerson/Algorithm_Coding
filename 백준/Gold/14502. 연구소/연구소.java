import java.util.*;

public class Main {
    static char[] arr = {'A', 'B', 'C', 'D'};
    static int L = 2;

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
     static int[][] board;
     static int max = 0;
     static List<int[]> list = new ArrayList<>();
     static List<int[]> viruous = new ArrayList<>();
     static int n, m;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt(); m = sc.nextInt();

        board = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                board[i][j] = sc.nextInt();

                if(board[i][j] == 2) viruous.add(new int[]{i,j});
                if(board[i][j] == 0) list.add(new int[]{i,j});
            }
        }

        bfs(0,new ArrayList<>());

        System.out.println(max);
    }

    static void bfs(int start, List<int[]> l) {
        if (l.size() == 3) {
            int[][] temp = new int[n][m];
            for(int i = 0; i < n; i++) temp[i] = board[i].clone();
            chceck(temp, l);
        }else{
            for (int i = start; i < list.size(); i++) {
                l.add(list.get(i));
                bfs(i + 1, l);
                l.remove(l.size() - 1);
            }
        }
    }

    static void chceck(int[][] temp, List<int[]> ll) {
        Queue<int[]> queue = new LinkedList<>();

        boolean[][] visited = new boolean[n][m];
        for (int[] pos : ll) {
            temp[pos[0]][pos[1]] = 1;
        }

        for(int[] vi : viruous) queue.add(new int[]{vi[0],vi[1]});

        while (!queue.isEmpty()) {
            int[] poll = queue.poll();

            int cx = poll[0];
            int cy = poll[1];

            for (int j = 0; j < 4; j++) {
                int nx = cx + dx[j];
                int ny = cy + dy[j];

                if(nx < 0 || ny < 0 || nx >= n || ny >= m) continue;

                if(!visited[nx][ny] && temp[nx][ny] == 0){
                    visited[nx][ny] = true;
                    temp[nx][ny] = 2;
                    queue.add(new int[]{nx,ny});
                }
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(temp[i][j] == 0) count++;
            }
        }

        max = Math.max(max, count);
    }
}
