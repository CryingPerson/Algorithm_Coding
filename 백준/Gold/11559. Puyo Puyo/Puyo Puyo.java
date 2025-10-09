import java.util.*;

public class Main {
    static int min = Integer.MAX_VALUE;
    static int max = Integer.MIN_VALUE;
    static char[][] board;
    static boolean[][] visited;
    static List<int[]> union;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        board = new char[12][6];

        for (int i = 0; i < 12; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < 6; j++) {
                board[i][j] = line.charAt(j);
            }
        }

        int count = 0;
        while (true) {
            boolean turn = true;
            visited = new boolean[12][6];
            union = new ArrayList<>();
            for (int i = 0; i < 12; i++) {
                for (int j = 0; j < 6; j++) {
                    if(!visited[i][j] && board[i][j] != '.'){
                        List<int[]> bfs = BFS(i, j);

                        if (bfs.size() >= 4) {
                            for (int[] pos : bfs) {
                                board[pos[0]][pos[1]] = '.';
                            }
                            turn = false;
                        }
                    }
                }
            }
            if(turn) break;

            down();
            count++;
        }
        System.out.println(count);

    }

    static void down() {
        for (int col = 0; col < 6; col++) {

            Queue<Character> queue = new LinkedList<>();

            for (int row = 11; row >= 0; row--) {
                if (board[row][col] != '.') {
                    queue.add(board[row][col]);
                    board[row][col] = '.';
                }
            }

            int ro = 11;
            while (!queue.isEmpty()) {
                board[ro--][col] = queue.poll();
            }
        }
    }

    static List<int[]> BFS(int x, int y) {
        visited[x][y] = true;

        List<int[]> retu = new ArrayList<>();

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x,y});
        int L = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();


            for (int i = 0; i < size; i++) {
                int[] poll = queue.poll();
                retu.add(poll);
                char color = board[poll[0]][poll[1]];

                for (int j = 0; j < 4; j++) {
                    int nx = poll[0] + dx[j];
                    int ny = poll[1] + dy[j];

                    if(nx < 0 || ny < 0 || nx >= 12 || ny >= 6) continue;

                    if(!visited[nx][ny] && board[nx][ny] == color){
                        visited[nx][ny] = true;
                        queue.add(new int[]{nx,ny});
                    }
                }
            }
        }
        return retu;
    }
}
