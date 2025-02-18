import java.lang.reflect.Array;
import java.util.*;

public class Main {
    static int INF = Integer.MAX_VALUE;
    static int[] ch;
    static ArrayList<ArrayList<Integer>> list;
    static int m;
    static int[] dis;
    static int answer = 0;
    static int[] dx = {-1, 1};

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int m = kb.nextInt();
        ch = new int[n+1];
        list = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            list.get(a).add(b);
            list.get(b).add(a);

        }
        BFS(1);
        System.out.println(answer);
    }
    public static void BFS(int n) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(n);
        ch[n] = 1;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int poll = queue.poll();

                for (int nx : list.get(poll)) {
                    if(ch[nx] == 0){
                        ch[nx] = 1;
                        answer++;
                        queue.add(nx);
                    }
                }
            }
        }
    }
}

