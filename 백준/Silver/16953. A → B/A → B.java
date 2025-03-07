import javax.xml.crypto.dsig.keyinfo.KeyInfo;
import java.util.*;

class Main {
    public static int row;
    public static int[][] board;
    public static int col;
    public static int sum = 0;
    public static int white = 0;
    public static int blue = 0;
    public static int[] ch;
    public static int findNum;
    public static int[] dx = {-1, 0, 1, 0};
    public static int[] dy = {0, 1, 0, -1};

    public static ArrayList<ArrayList<Integer>> list;

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        findNum = kb.nextInt();
        long bfs = BFS(n);
        System.out.println(bfs);
    }

    public static long BFS(int start) {
        Queue<Integer> queue = new LinkedList<>();
        HashSet<Integer> set = new HashSet<>();
        set.add(start);
        queue.add(start);

        int L = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Integer poll = queue.poll();

                if (poll == findNum) {
                    return L;
                }

                int nx = poll * 2;
                if (nx <= findNum && !set.contains(nx)) {
                    set.add(nx);
                    queue.add(nx);
                }
                String st = poll + "1";
                long st1 = Long.parseLong(st);
                if (check(st1)) continue;
                int st2 = (int) st1;
                if (st2 <= findNum && !set.contains(st2)) {
                    set.add(st2);
                    queue.add(st2);
                }
            }
            L++;
        }
        return -1;
    }

    public static boolean check(long num) {
        if (num > Integer.MAX_VALUE) return true;
        else return false;
    }
}
