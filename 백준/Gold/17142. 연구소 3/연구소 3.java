import java.util.*;

public class Main {
    static int n,m;
    static int[][] board;

    static int count = 0;

    static List<int[]> virus = new ArrayList<>();
    static int min = Integer.MAX_VALUE;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();  m = sc.nextInt();

        board = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
                if(board[i][j] == 2) virus.add(new int[]{i,j});
                if(board[i][j] == 0) count++;
            }
        }

        if(count == 0){
            System.out.println(0);
            return;
        }
        combi(0, new ArrayList<>());

        if (min == Integer.MAX_VALUE) {
            System.out.println(-1);
        }else System.out.println(min);

    }

    static void combi(int start, List<int[]> tempVirus) {
        if (tempVirus.size() == m) {
            int[][] temp = new int[n][n];

            for (int i = 0; i < n; i++) {
                temp[i] = board[i].clone();
            }
            int spay = spay(temp, tempVirus);
            if(spay != Integer.MAX_VALUE) min = Math.min(min ,spay);
        }else{
            for (int i = start; i < virus.size(); i++) {
                tempVirus.add(new int[]{virus.get(i)[0], virus.get(i)[1]});
                combi(i + 1, tempVirus);
                tempVirus.remove(tempVirus.size() - 1);
            }
        }
    }

    static int spay(int[][]temp, List<int[]> te) {
        Queue<int[]> queue = new LinkedList<>();

        int empty = count;
        boolean[][] visited = new boolean[n][n];
        for(int[] vi : te){
            visited[vi[0]][vi[1]] = true;
            queue.add(new int[]{vi[0], vi[1]});
        }

        int L = 0;
        while (!queue.isEmpty()) {

            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int[] poll = queue.poll();

                int cx = poll[0];
                int cy = poll[1];
                for (int j = 0; j < 4; j++) {
                    int nx = cx + dx[j];
                    int ny = cy + dy[j];

                    if(nx < 0 || ny < 0 || nx >= n || ny >=n) continue;
                    if(temp[nx][ny] == 1) continue;

                    if(visited[nx][ny]) continue;

                    visited[nx][ny] = true;
                    queue.add(new int[]{nx,ny});

                    if(temp[nx][ny] == 0){
                        empty--;

                        if(empty == 0) return L + 1;
                    }
                }
            }
            L++;
        }
        return Integer.MAX_VALUE;
    }
}
