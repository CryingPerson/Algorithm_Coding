import java.util.*;

public class Main {
    static int[][] arr;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int count = 0;
    static int check= 0;
    static boolean flag = true;
    static int x,y;
    static int repairX, repairY;
    static boolean[][] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         x = sc.nextInt();
         y = sc.nextInt();
        arr = new int[x][y];
        visited = new boolean[x][y];
        int robotX = sc.nextInt();
        int robotY = sc.nextInt();
        int dir = sc.nextInt();

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        while (true) {
            if (!visited[robotX][robotY]) {
                visited[robotX][robotY] = true;
                count++;
            }

            boolean check = false;
            for (int i = 0; i < 4; i++) {
                int nx = robotX + dx[i];
                int ny = robotY + dy[i];

                if (!visited[nx][ny] && arr[nx][ny] == 0) {
                    check = true;
                    break;
                }
            }
            if (check) {
                dir = (dir + 3) % 4;
                int nx = robotX + dx[dir];
                int ny = robotY + dy[dir];

                if(!visited[nx][ny] && arr[nx][ny] == 0){
                    robotX = nx;
                    robotY = ny;
                }
            }else{
                int back = (dir + 2) % 4;
                int nx = robotX + dx[back];
                int ny = robotY + dy[back];

                if(arr[nx][ny] == 1) break;

                robotX = nx;
                robotY = ny;
            }
        }

        System.out.println(count);
    }

}
