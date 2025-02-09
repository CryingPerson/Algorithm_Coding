
import java.util.*;

class Main {
    static int[] dx = {-1, 0, 1, 0}; //
    static  ArrayList<ArrayList<Integer>> list;
    static int[] dy = {0, 1, 0, -1};
    static int[] ch;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ch = new int[n+1];
        list = new ArrayList<>();
        for (int i = 0; i <= n; i++) {

            list.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            list.get(a).add(b);
            list.get(b).add(a);
        }
        int cnt = 0;
        int bfs = BFS(1, cnt);
        System.out.println(bfs);
    }

    public static int BFS( int n, int cnt) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(n);
        ch[1]= 1;
        while (!queue.isEmpty()) {
            Integer poll = queue.poll();
            cnt++;
            for(int x : list.get(poll)){
                if(ch[x] != 1){
                    ch[x] = 1;
                    queue.add(x);
                }
            }
        }
        return cnt-1;
    }
}
