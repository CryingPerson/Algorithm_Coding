import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        char[][] tile = new char[a][b];
        boolean[][] check = new boolean[a][b];

        sc.nextLine();
        for (int i = 0; i < a; i++) {
            String s = sc.nextLine();
            for (int j = 0; j < b; j++) {
                tile[i] = s.toCharArray();
            }
        }
        int cnt = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (!check[i][j]) {
                    cnt++;
                    DFS(i,j,tile,check);
                }
            }
        }
        System.out.println(cnt);
    }

    public static void DFS(int x, int y, char[][] ti, boolean[][] ch) {
        ch[x][y] = true;
        if(ti[x][y] == '-'){
            int ny = y + 1;
            if (ny < ti[0].length && ti[x][ny] == '-' && !ch[x][ny]) {
                DFS(x,ny,ti,ch);
            }
        } else if (ti[x][y] == '|') {
            int nx = x + 1;
            if (nx < ti.length && ti[nx][y] == '|' && !ch[nx][y]) {
                DFS(nx,y,ti,ch);
            }
        }
    }
}
