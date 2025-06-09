import java.util.*;

public class Main {
    static int[] dx = {1, 0, -1, 0}; // 남, 서, 북, 동
    static int[] dy = {0, -1, 0, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        String commands = sc.next();

        List<int[]> path = new ArrayList<>();
        int x = 0, y = 0, dir = 0;
        path.add(new int[]{x, y});

        for (char cmd : commands.toCharArray()) {
            if (cmd == 'L') {
                dir = (dir + 3) % 4;
            } else if (cmd == 'R') {
                dir = (dir + 1) % 4;
            } else if (cmd == 'F') {
                x += dx[dir];
                y += dy[dir];
                path.add(new int[]{x, y});
            }
        }

        // 경로 전체 범위 구하기
        int minX = Integer.MAX_VALUE, maxX = Integer.MIN_VALUE;
        int minY = Integer.MAX_VALUE, maxY = Integer.MIN_VALUE;
        for (int[] p : path) {
            minX = Math.min(minX, p[0]);
            maxX = Math.max(maxX, p[0]);
            minY = Math.min(minY, p[1]);
            maxY = Math.max(maxY, p[1]);
        }

        int height = maxX - minX + 1;
        int width = maxY - minY + 1;

        // 미로 초기화
        char[][] maze = new char[height][width];
        for (int i = 0; i < maze.length; i++) {
            Arrays.fill(maze[i], '#');
        }
        for (int[] x2 : path) {
            int r = x2[0] - minX;
            int c = x2[1] - minY;
            maze[r][c] = '.';
        }
        for (char[] ch : maze) {
            for (char ch2 : ch) {
                System.out.print(ch2);
            }
            System.out.println();
        }
    }
}
