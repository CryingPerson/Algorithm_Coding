import java.util.*;

public class Main {
    static int[][] board;
    static int[][] count;
    static int[][] speedArray;
    static List<int[]> ball;
    static List<int[]> del;
    static Map<String, List<Integer>> map;
    static int[][] dir = {
            {-1, 0}, {-1, 1}, {0, 1}, {1, 1},
            {1, 0}, {1, -1}, {0, -1}, {-1, -1}
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        board = new int[n][n];
        count = new int[n][n];
        speedArray = new int[n][n];
        map = new HashMap<>();

        del = new ArrayList<>();
        ball = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            int we = sc.nextInt();
            int s = sc.nextInt();
            int d = sc.nextInt();

            ball.add(new int[]{x, y, we});
            del.add(new int[]{s, d});
        }

        while (k > 0) {
            for (int i = 0; i < n; i++) {
                Arrays.fill(board[i], 0);
                Arrays.fill(count[i], 0);
                Arrays.fill(speedArray[i], 0);
            }
            map.clear();

            for (int i = 0; i < ball.size(); i++) {
                int[] ints = ball.get(i);
                int[] ints1 = del.get(i);

                int cx = ints[0];
                int cy = ints[1];

                int speed = ints1[0];
                int direction = ints1[1];

                int[] move = dir[direction];
                int nx = ((cx + move[0] * speed) % n + n) % n;
                int ny = ((cy + move[1] * speed) % n + n) % n;

                board[nx][ny] += ints[2];
                count[nx][ny]++;
                speedArray[nx][ny] += speed;

                String key = nx + "," + ny;
                map.putIfAbsent(key, new ArrayList<>());
                map.get(key).add(direction);
            }
            ball.clear();
            del.clear();

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if(count[i][j] == 0) continue;


                    if (count[i][j] == 1) {
                        String key = i + "," + j;
                        int dir = map.get(key).get(0);
                        ball.add(new int[]{i, j, board[i][j]});
                        del.add(new int[]{speedArray[i][j], dir});
                        continue;
                    }

                    if (count[i][j] >= 2) {
                        instance(i, j, board[i][j]);
                    }
                }
            }

            k--;
        }
        int sum = 0;
        for (int[] b : ball) sum += b[2];
        System.out.println(sum);
    }

    static void instance(int x, int y, int totalWeigh) {
        int total = count[x][y];
        int l = totalWeigh / 5;

        if(l == 0) return;

        int speed = speedArray[x][y] / total;

        String key = x + "," + y;
        List<Integer> directions = map.get(key);

        if (directions == null) return;

        boolean zak = true;
        boolean hall = true;
        for (int xx : directions) {
            if (xx % 2 != 0) {
                zak = false;
            }
            if (xx % 2 == 0) {
                hall = false;
            }
        }

        if (zak || hall) {
            ball.add(new int[]{x, y, l});
            del.add(new int[]{speed, 0});


            ball.add(new int[]{x, y, l});
            del.add(new int[]{speed, 2});


            ball.add(new int[]{x, y, l});
            del.add(new int[]{speed, 4});

            ball.add(new int[]{x, y, l});
            del.add(new int[]{speed, 6});
        }else{
            ball.add(new int[]{x, y, l});
            del.add(new int[]{speed, 1});


            ball.add(new int[]{x, y, l});
            del.add(new int[]{speed, 3});


            ball.add(new int[]{x, y, l});
            del.add(new int[]{speed, 5});

            ball.add(new int[]{x, y, l});
            del.add(new int[]{speed, 7});
        }


    }
}
