import java.math.BigInteger;
import java.util.*;

public class Main {
    static int a1 = 0;
    static int b1 = 0;
    static boolean active = true;
    static int[] dx = {0, 1, 0 ,- 1};
    static int[] dy = {1, 0, -1, 0};
    static int[] cx = {-1, -1, 1, 1};
    static int[] cy = {-1, 1, 1, -1};
    static boolean[] visited;
    static int cnt = 0;
    static int dir;
    static int x;
    static int y;
    static boolean[][] snake;
    static boolean[][] temp;
    static int[][] board;

    static boolean[] cups;
    public static int roomMax;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); int m = sc.nextInt();
        int[][] train = new int[n][20];

        sc.nextLine();
        for (int i = 0; i < m; i++) {
            String[] cmd = sc.nextLine().split(" ");
            if(cmd[0].equals("1") || cmd[0].equals("2")){
                int trainNum = Integer.parseInt(cmd[1]);
                int seat = Integer.parseInt(cmd[2]);
                if(cmd[0].equals("1")){
                    if(train[trainNum -1][seat - 1] == 0){
                        train[trainNum - 1][seat - 1] = 1;
                    }
                }else{
                    if(train[trainNum -1][seat - 1] == 1){
                        train[trainNum - 1][seat - 1] = 0;
                    }
                }
            }else{
                int trainNum = Integer.parseInt(cmd[1]);
                if (cmd[0].equals("3")) {
                    if(train[trainNum - 1][19] == 1){
                        train[trainNum - 1][19] = 0;
                    }
                    for (int j = 18; j >= 0; j--) {
                        if (train[trainNum -1][j] == 1) {
                            train[trainNum - 1][j] = 0;
                            train[trainNum - 1][j + 1] = 1;
                        }
                    }
                }else{
                    if(train[trainNum - 1][0] == 1){
                        train[trainNum - 1][0] = 0;
                    }
                    for (int j = 1; j < 20; j++) {
                        if (train[trainNum -1][j] == 1) {
                            train[trainNum - 1][j] = 0;
                            train[trainNum - 1][j - 1] = 1;
                        }
                    }
                }
            }
        }



        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < train.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < 20; j++) {
                sb.append(train[i][j]);
            }
            set.add(sb.toString());
        }
        System.out.println(set.size());
    }

    static void back(int[][] traint) {

    }
}
