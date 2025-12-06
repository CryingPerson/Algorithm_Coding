import java.util.*;

class Main {
    static int[][] board;
    static int[][] origin;
    static List<int[]> temp;

    static int n,m,d;
    static List<int[]> removePoint;
    static int max = -1;

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] mrio = new int[100][100];

        int n = sc.nextInt();

        String cmd = sc.next();

        int dir = 2;
        int startX = 50;
        int startY = 50;

        List<int[]> point = new ArrayList<>();
        mrio[startX][startY] = 1;
        point.add(new int[]{startX,startY});
        for (char c : cmd.toCharArray()) {
            if(c == 'R'){
                dir = (dir + 1) % 4;
            }else if(c == 'L'){
                dir = (dir + 3) % 4;
            }else{
                int nx = startX + dx[dir];
                int ny = startY + dy[dir];

                mrio[nx][ny] = 1;
                point.add(new int[]{nx,ny});

                startX = nx;
                startY = ny;
            }
        }
        int minX = 200;
        int maxX = -100;
        int minY = 200;
        int maxY = -100;
        for (int[] pos : point) {
            minX = Math.min(minX, pos[0]);
            maxX = Math.max(maxX, pos[0]);
            minY = Math.min(minY, pos[1]);
            maxY = Math.max(maxY, pos[1]);
        }


        for (int i = minX; i <= maxX; i++) {
            for (int j = minY; j <= maxY; j++) {
                if(mrio[i][j] == 1){
                    System.out.print(".");
                }else System.out.print("#");
            }
            System.out.println();
        }


    }
}
