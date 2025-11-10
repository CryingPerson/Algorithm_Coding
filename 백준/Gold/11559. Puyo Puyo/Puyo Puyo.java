import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int x, y;
    static List<int[]> possible;
    static char[][] board;
    static boolean[][] visited;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);

        board = new char[12][6];

        for (int i = 0; i < 12; i++) {
            board[i] = sc.nextLine().toCharArray();
        }



        int day = 0;
        while (true) {
            boolean end = true;
            visited = new boolean[12][6];
            for (int i = 0; i < 12; i++) {
                for (int j = 0; j < 6; j++) {

                    if (!visited[i][j] && board[i][j] != '.') {
                        possible = new LinkedList<>();
                        int cc = BFS(i, j);

                        if (cc >= 4) {
                            for (int[] pos : possible) {
                                board[pos[0]][pos[1]] = '.';
                            }
                            end = false;
                        }
                    }
                }
            }
            if (end) break;
            day++;
            simul();

        }
        System.out.println(day);
    }

    static void simul() {
        Queue<Character> queue = new LinkedList<>();
        for (int j = 0; j < 6; j++) {
            for (int i = 11; i >= 0; i--) {
                if(board[i][j] != '.'){
                    queue.add(board[i][j]);
                    board[i][j] = '.';
                }
            }

            for (int i = 11; i >= 0; i--) {
                if(board[i][j] == '.'){
                    if(!queue.isEmpty()) board[i][j] = queue.poll();
                }
            }
            queue.clear();
        }
    }

    static int BFS(int x, int y) {
        visited[x][y] = true;

        Queue<int[]> queue = new LinkedList<>();

        queue.add(new int[]{x, y});
        possible.add(new int[]{x, y});
        int L = 1;
        char cur = board[x][y];
        while (!queue.isEmpty()) {
            int[] poll = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nx = poll[0] + dx[i];
                int ny = poll[1] + dy[i];

                if (nx < 0 || ny < 0 || nx >= 12 || ny >= 6) continue;
                if (!visited[nx][ny] && board[nx][ny] == cur) {
                    queue.add(new int[]{nx, ny});
                    visited[nx][ny] = true;
                    possible.add(new int[]{nx, ny});
                    L++;
                }

            }
        }
        return L;
    }

}