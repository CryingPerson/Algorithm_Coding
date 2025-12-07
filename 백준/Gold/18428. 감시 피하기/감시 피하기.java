import java.util.*;

class Main {
    static String[][] board;
    static int[][] origin;
    static List<int[]> temp;
    static boolean end = true;

    static int Size = 0;
    static int n, m, d;
    static List<int[]> removePoint;
    static int max = -1;

    static List<int[]> teacher;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static boolean[]visited;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        board = new String[n][n];
        sc.nextLine();

        teacher = new LinkedList<>();
        temp = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            String[] line = sc.nextLine().split(" ");
            for (int j = 0; j < n; j++) {
                board[i][j] = line[j];
                if(board[i][j].equals("X")){
                    temp.add(new int[]{i,j});
                }
                if(board[i][j].equals("S")) Size++;
                if(board[i][j].equals("T")) teacher.add(new int[]{i,j});
            }
        }

        combi(0, new LinkedList<>());
        if(end) System.out.println("NO");
    }

    static void combi(int start, List<int[]> list) {
        if(!end) return;
        if (list.size() == 3) {
            String[][] temp = new String[n][n];
            for (int i = 0; i < n; i++) {
                temp[i] = board[i].clone();
            }
            dfs2(list, temp);

            if(check(temp)){
                System.out.println("YES");
                end = false;
                return;
            }
            return;
        }
        for (int i = start; i < temp.size(); i++) {
            list.add(temp.get(i));
            combi(i + 1, list);
            list.remove(list.size() - 1);
        }
    }

    static boolean check(String[][] temp) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(temp[i][j].equals("S")) count++;
            }
        }
        if(count == Size) return true;

        return false;
    }

    static void dfs2(List<int[]> list, String[][] temp) {
        for (int[] pos : list) {
            temp[pos[0]][pos[1]] = "O";
        }
        boolean[][] visiteds = new boolean[n][n];

        Queue<int[]> queue = new LinkedList<>();

        for (int[] ts : teacher) {
            queue.add(new int[]{ts[0],ts[1]});
        }

        while (!queue.isEmpty()) {
            int[] poll = queue.poll();

            int cx = poll[0];
            int cy = poll[1];

            for (int i = 0; i < 4; i++) {
                spary(temp,cx,cy,i);
            }
        }

    }

    static void spary(String[][] temp, int cx, int cy, int dir) {
        while (true) {
            int nx = cx + dx[dir];
            int ny = cy + dy[dir];

            if(nx < 0 || ny < 0 || nx >= n || ny >= n) break;

            if(temp[nx][ny].equals("O")) break;

            if(temp[nx][ny].equals("S")) temp[nx][ny] = "X";

            cx = nx;
            cy = ny;
        }
    }
}