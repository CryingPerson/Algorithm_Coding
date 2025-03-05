import javax.xml.crypto.dsig.keyinfo.KeyInfo;
import java.util.*;

class Main {
    public static int maxTemp = 0;
    public static int[] diss;
    public static int cnt = 0;
    public static int[] ch;
    private static int b;
    public static ArrayList<ArrayList<Integer>> list;

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ch = new int[n + 1];
        int a = kb.nextInt();
        b = kb.nextInt();
        int T = kb.nextInt();
        list = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < T; i++) {
            int e = kb.nextInt();
            int t = kb.nextInt();

            list.get(e).add(t);
            list.get(t).add(e);
        }
        int dfs = DFS(a);
        System.out.println(dfs);
    }

    public static int DFS(int start) {
        ch[start] = 1;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Integer poll = queue.poll();

                if (poll == b) return cnt;

                for (int link : list.get(poll)) {
                    if(ch[link] == 0){
                        ch[link] = 1;
                        queue.add(link);
                    }
                }
            }
            cnt++;
        }
        if(ch[b] == 0){
            return -1;
        }
        return -1;
    }
}