import java.util.*;

class Main {
    static int[] dx = {-1, 0, 1, 0}; //
    static ArrayList<ArrayList<Integer>> list;
    static int[] dy = {0, 1, 0, -1};
    static int[][] board;
    static Queue<point> queue;
    static int[]ch;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int m = sc.nextInt();
        list = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            list.get(a).add(b);
            list.get(b).add(a);
        }
        ch = new int[n+1];
        int cnt= 0 ;
        for (int i = 1; i <= n; i++) {
            if(ch[i] == 0){
                ch[i] = 1;
                cnt++;
                DFS(i);
            }
        }
        System.out.println(cnt);
    }
    public static void DFS(int n){

        for(int x : list.get(n)){
            if(ch[x] == 0){
                ch[x] = 1;
                DFS(x);
            }
        }
    }
}

class point {
    int x;
    int y;

    public point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
