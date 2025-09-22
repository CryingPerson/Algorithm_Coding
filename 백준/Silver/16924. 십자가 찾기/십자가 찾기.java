import java.util.*;
class Main {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static boolean[][] snake;
    static int[][] board;
    static char[][] star;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt(); int y = sc.nextInt();

        star = new char[x][y];

        sc.nextLine();
        for (int i = 0; i < x; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < y; j++) {
                star[i][j] = line.charAt(j);
            }
        }

        List<int[]> list = new ArrayList<>();
        for (int i = 1; i < x; i++) {
            for (int j = 1; j < y; j++) {
                if(star[i][j] == '*'){
                    List<Integer> check = check(i, j);
                    for(int k = 0; k < check.size(); k++){
                            list.add(new int[]{i + 1,j + 1,check.get(k)});
                        }
                }
            }
        }

        char[][] temp = new char[x][y];

        for(int i = 0; i < x; i++) Arrays.fill(temp[i], '.');

        for (int[] pos : list) {
            int tx = pos[0] - 1;
            int ty = pos[1] - 1;
            int kk = pos[2];

            temp[tx][ty] = '*';
            for (int j = 1; j <= kk; j++) {
                temp[tx][ty +j] = '*';
                temp[tx + j][ty] = '*';
                temp[tx - j][ty] = '*';
                temp[tx][ty- j] = '*';
            }
        }

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if(temp[i][j] != star[i][j]) {
                    System.out.println(-1);
                    return;
                }
            }
        }

        System.out.println(list.size());
        for (int[] pos : list) {
            System.out.println(pos[0] + " " + pos[1] + " " + pos[2]);
        }
    }

    static List<Integer> check(int x, int y) {
        List<Integer> list = new ArrayList<>();

        int up = simul(x, y, 0);
        int right = simul(x, y, 1);
        int down = simul(x, y, 2);
        int lefty = simul(x, y, 3);

        int min = Math.min(Math.min(up, right), Math.min(down, lefty));

        for (int i = min; i >= 1; i--) {
            list.add(i);
        }

        return list;
    }

    static int simul(int x, int y, int dir) {
        int[] dx = {-1, 0 , 1, 0};
        int[] dy = {0, 1, 0, -1};

        int count = 0;
        while (true) {
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if(nx < 0 || ny < 0 || nx >= star.length || ny >= star[0].length || star[nx][ny] == '.') break;

            if(star[nx][ny] == '*'){
                count++;
            }
            x = nx;
            y = ny;
        }
        return count;
    }
}