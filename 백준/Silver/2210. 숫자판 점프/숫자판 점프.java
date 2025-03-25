import javax.swing.plaf.PanelUI;
import java.awt.*;
import java.util.*;
import java.util.List;

class Main {
    public static int n, m;
    public static ArrayList<ArrayList<Integer>> list;
    public static boolean[] visited;
    public static int[][]board;
    public static int[]dx = {-1,0,1,0};
    public static int[]dy = {0,1,0,-1};
    public static Set<String> st = new HashSet<>();
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        board = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                board[i][j] = kb.nextInt();
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                DFS(i,j,""+ board[i][j]);
            }
        }
        System.out.println(st.size());
    }

    public static void DFS(int x, int y, String s) {
        if(s.length() == 6){
            st.add(s);
            return;
        }

        for (int i = 0; i < 4; i++) {
            int nx = dx[i] + x;
            int ny = dy[i] + y;

            if (nx >= 0 && nx < 5 && ny >= 0 && ny < 5) {
                DFS(nx,ny,s + board[nx][ny]);
            }
        }
    }
}
