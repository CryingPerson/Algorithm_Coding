import java.util.*;

class Main {
    static int[][] board;
    static int x, y;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static List<int[]> temp;

    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int a = 0; a < t; a++) {
            board = new int[9][9];

            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    board[i][j] = sc.nextInt();
                }
            }

            boolean ok = true;

            int sum = 45;

            for (int i = 0; i < 9; i++) {
                int count = 0;
                int count2 = 0;
                if(!ok) continue;
                boolean[] visited = new boolean[10];
                boolean[] visited2 = new boolean[10];
                for (int j = 0; j < 9; j++) {
                    int num = board[i][j];
                    if(visited[num]){
                        System.out.println("Case "+ (a + 1) + ":" + " INCORRECT");
                        ok = false;
                        break;
                    }else{
                        visited[num] = true;
                    }
                    int num2 = board[j][i];
                    if (visited2[num2]) {
                        System.out.println("Case "+ (a + 1) + ":" + " INCORRECT");
                        ok = false;
                        break;
                    }else{
                        visited2[num2] = true;
                    }
                }
            }
            if (ok) {
                for (int i = 0; i < 9; i += 3) {
                    if(!ok) continue;
                    for (int j = 0; j < 9; j += 3) {
                        int count = 0;
                        count += plus(i,j);
                        if (count == 1) {
                            System.out.println("Case "+ (a + 1) + ":" + " INCORRECT");
                            ok = false;
                            break;
                        }
                    }
                }
            }

            if(ok) System.out.println("Case "+ (a + 1) + ":" + " CORRECT");

        }
    }

    static int plus(int x, int y) {
        int sum = 0;
        boolean[] visi = new boolean[10];
        for (int i = x; i < x + 3; i++) {
            for (int j = y; j < y + 3; j++) {
                if(visi[board[i][j]]){
                    return 1;
                }else{
                    visi[board[i][j]] = true;
                }

            }
        }
        return 0;
    }
}