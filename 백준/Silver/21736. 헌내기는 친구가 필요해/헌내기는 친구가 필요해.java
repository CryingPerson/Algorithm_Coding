import java.util.*;

public class Main {
    static int N;
    static char[][] graph;
    static int[][] result;
    static int[]dx = {1,0,-1,0};
    static int[]dy = {0,1,0,-1};
    static int L = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); int m = sc.nextInt();

        sc.nextLine();
        int x = 0; int y = 0;
        graph = new char[n][m];
        for(int i = 0; i < n; i++){
            String line = sc.nextLine();
            for(int j = 0; j < m; j++){
                char[] ch = line.toCharArray();
                if(ch[j] == 'I'){
                     x = i;
                     y = j;
                }
                graph[i][j] = ch[j];
            }
        }

        DFS(x,y,n,m);
        if(L == 0) {
            System.out.println("TT");
            return;
        }
        System.out.println(L);
    }
    static void DFS(int start, int end, int n, int m){
        for (int i = 0; i < 4; i++) {
            int nx = start + dx[i];
            int ny = end + dy[i];

            if(nx >= 0 && ny >= 0 && nx < n && ny < m && graph[nx][ny] != 'X'){
                if(graph[nx][ny] == 'O' || graph[nx][ny] == 'P' || graph[nx][ny] == 'I') {
                    if (graph[nx][ny] == 'P') {
                        L++;
                    }
                    graph[nx][ny] = 'X';
                }
                DFS(nx,ny,n,m);
            }
        }
    }
}
