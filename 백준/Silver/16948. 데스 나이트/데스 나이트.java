import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int[][] board;

    public static int[]dx = {-2,-2,0,0,2,2};
    public static int[]dy = {-1,1,-2,2,-1,1};
    public static int r1;
    public static int c1;
    public static int r2;
    public static int c2;
    public static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         n = sc.nextInt();
        board = new int[n][n];
             r1 = sc.nextInt();
             c1 = sc.nextInt();
             r2 = sc.nextInt();
             c2 = sc.nextInt();

        int ans = BFS();
        if(ans == -1){
            System.out.println(-1);
            return;
        }
        System.out.println(ans);

    }
    public static int BFS(){
        Queue<point> queue = new LinkedList<>();
        queue.add(new point(r1,c1));

        int L = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                point poll = queue.poll();
                if(poll.x == r2 && poll.y == c2) {
                    return L;
                }
                for(int j = 0; j < 6; j++) {
                    int nx = poll.x + dx[j];
                    int ny = poll.y + dy[j];
                    if(nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 0) {
                        board[nx][ny] = 1;
                        queue.add(new point(nx,ny));
                    }
                }
            }
            L++;
        }
        return -1;
    }
}
class point{
    int x;
    int y;
    public point(int x, int y){
        this.x = x;
        this.y = y;
    }
}
