import java.util.*;

class Main {
    static int[][] board;
    static int x, y;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static List<int[]> temp;
    static int m;
    static int n;
    static int min = Integer.MAX_VALUE;
    static int[][] doublCheck;
    static boolean[][] dobulCheck;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

         n = sc.nextInt();  m = sc.nextInt();



        doublCheck = new int[n][n];
        board = new int[n][n];
        dobulCheck = new boolean[n][n];
        temp = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
                doublCheck[i][j] = board[i][j];
                if(board[i][j] == 2){
                    temp.add(new int[]{i,j});
                }
            }
        }
        int count= 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                count++;

            }
        }
        if(count == 1){
            System.out.println(0);
            return;
        }

        List<int[]> aa = new ArrayList<>();
        dfs(0,0, aa);
        if(min == Integer.MAX_VALUE){
            System.out.println(-1);
            return;
        }
        System.out.println(min);
    }

    static void dfs(int depth, int start, List<int[]> list) {
        if (depth == m ) {

            back();
            int check = check(list);
            if(all()){
                min = Math.min(check,min);
            }
            return;
        }

        for (int i = start; i < temp.size(); i++) {
            int[] ints = temp.get(i);
            list.add(new int[]{ints[0], ints[1]});
            dfs(depth + 1, i + 1, list);
            list.remove(list.size() - 1);
        }
    }

    static void back() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                doublCheck[i][j] = board[i][j];
            }
        }
    }

    static boolean all() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (doublCheck[i][j] == 0) {
                    return false;
                }
                if (doublCheck[i][j] == 2 && !dobulCheck[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
    static int check(List<int[]> list){
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visitied = new boolean[n][n];
        dobulCheck = new boolean[n][n];
        for (int[] pos : list) {
            visitied[pos[0]][pos[1]] = true;
            queue.add(new int[]{pos[0], pos[1]});
            dobulCheck[pos[0]][pos[1]] = true;
        }

        int L = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int[] c = queue.poll();

                for (int j = 0; j < 4; j++) {
                    int nx = c[0] + dx[j];
                    int ny = c[1] + dy[j];

                    if(nx < 0 || ny < 0 || nx >= n || ny >= n) continue;
                    if (doublCheck[nx][ny] == 1) continue;
                    if(visitied[nx][ny]) continue;;

                    if (!visitied[nx][ny] && doublCheck[nx][ny] != 1) {
                        visitied[nx][ny] = true;

                        if (doublCheck[nx][ny] == 0) {
                            doublCheck[nx][ny] = -1;
                            dobulCheck[nx][ny] = true;
                            queue.add(new int[]{nx, ny});
                        } else {
                            queue.add(new int[]{nx, ny});
                            dobulCheck[nx][ny] = true;
                        }
                    }
                }
            }
            L++;

        }
        return L - 1;
    }
}