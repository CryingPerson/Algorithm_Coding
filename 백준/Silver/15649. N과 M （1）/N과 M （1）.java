import java.util.*;

class Main {
    static char[][] board;
    static int[] dx = {-1, 0, 1, 0}; // U R D L
    static int[] dy = {0, 1, 0, -1};
    static int[] arr;
    static boolean[] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int N = sc.nextInt(); int M = sc.nextInt();
        arr = new int[M];
        visited = new boolean[N];
        DFS(N,M,0);

    }
    static void DFS(int n, int m, int depth){
        if(depth == m){
            for (int num : arr){
                System.out.print(num + " ");
            }
            System.out.println();
        }else{
            for (int i = 1; i <= n; i++) {
                if (!visited[i - 1]) {
                    arr[depth] = i;
                    visited[i-1] = true;
                    DFS(n,m,depth + 1);
                    visited[i-1] = false;
                }
            }
        }
    }
}
