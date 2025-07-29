import java.math.BigInteger;
import java.util.*;

class Main {
    static Set<String> set = new HashSet<>();
    static List<int[]> list;
    static int idx = 0;
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    static List<int[]> po;
    static boolean flag = false;
    static int[] point;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] board = new int[19][19];

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                if (board[i][j] == 1) {
                    po = new ArrayList<>();
                    if(check(board, i, j)){
                        Collections.sort(po, ((o1, o2) -> {
                            if(o1[1] == o2[1]){
                                return o1[0] - o2[0];
                            }
                            return o1[1] - o2[1];
                        }));
                        if(flag){
                            System.out.println(1);
                            System.out.print(po.get(0)[0] + 1 + " ");
                            System.out.println(po.get(0)[1] + 1);
                        }
                        return;
                    }
                } else if (board[i][j] == 2) {
                    if(check(board, i, j)){
                        Collections.sort(po, ((o1, o2) -> {
                            if(o1[1] == o2[1]){
                                return o1[0] - o2[0];
                            }
                            return o1[1] - o2[1];
                        }));
                        if(flag){
                            System.out.println(2);
                            System.out.print(po.get(0)[0] + 1 + " ");
                            System.out.println(po.get(0)[1] + 1);
                        }
                        return;
                    }
                }
            }
        }
        System.out.println(0);
    }

    static boolean check(int[][] board, int x, int y) {
        int num = board[x][y];

        int dir = 0;
        int nx = -1;
        int ny = -1;
        int ans = 0;
        for (int i = 0; i < 8; i++) {
            int cnt = 1;
            point = new int[2];
            po = new ArrayList<>();
            po.add(new int[]{x,y});
             flag = false;
            nx = x + dx[i];
            ny = y + dy[i];
            if (nx >= 0 && nx < board.length && ny >= 0 && ny < board[0].length) {
                if (board[nx][ny] == num) {
                    po.add(new int[]{nx,ny});
                    cnt++;
                }else {
                    po.clear();
                    continue;
                }
            }
            for (int j = 0; j < 4; j++) {
                nx = nx + dx[i];
                ny = ny + dy[i];
                if (nx >= 0 && nx < board.length && ny >= 0 && ny < board[0].length) {
                    if(board[nx][ny] != num) break;
                    if (board[nx][ny] == num) {
                        po.add(new int[]{nx,ny});
                        cnt++;
                    }
                }
            }
            for (int j = 0; j < 6; j++) {
                nx = x + dx[(i+4) % 8];
                ny = y + dy[(i+4) % 8];
                if (nx >= 0 && nx < board.length && ny >= 0 && ny < board[0].length) {
                    if(board[nx][ny] != num) break;
                    if (board[nx][ny] == num) {
                        po.add(new int[]{nx,ny});
                        x = nx;
                        y = ny;
                        cnt++;
                    }
                }
            }
            if(cnt == 5) {
                flag = true;
                return true;
            }
        }
        return false;
    }

}
