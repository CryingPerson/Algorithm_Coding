import java.util.*;

public class Main {
    static ArrayList<ArrayList<Integer>> list;
    static int[]ch;
    static int k;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int m = sc.nextInt();  k = sc.nextInt(); int x = sc.nextInt();

        ch = new int[n+1];
        list = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            list.get(a).add(b);
        }
        List<Integer> bfs = BFS(x);
        Collections.sort(bfs);

        if(bfs.isEmpty()){
            System.out.println(-1);
            return;
        }
        for(int q : bfs){
            System.out.println(q);
        }

    }
    public static List BFS(int start){
        ch[start] = 1;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        List<Integer> list1 = new ArrayList<>();
        int L = 0;
        while (!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Integer poll = queue.poll();
                if(L == k){
                    list1.add(poll);
                }
                for(int x : list.get(poll)){
                    if(ch[x] == 0){
                        ch[x] = 1;
                        queue.add(x);
                    }
                }
            }
            L++;
        }
        return list1;
    }
}