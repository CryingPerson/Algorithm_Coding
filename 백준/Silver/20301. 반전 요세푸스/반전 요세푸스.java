import java.util.*;
class Main {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static boolean[][] snake;
    static int[][] board;
    static char[][] star;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); int k = sc.nextInt(); int m = sc.nextInt();

        Deque<Integer> queue = new LinkedList<>();

        for(int i = 1; i <= n; i++) queue.add(i);

        int pos = 1;
        int dir = 0;
        int count = 0;
        List<Integer> list = new ArrayList<>();
        while (!queue.isEmpty()) {
            
            if (dir == 0) {
                for (int i = pos; i < k; i++) {
                    queue.addLast(queue.pollFirst());
                }
                list.add(queue.pollFirst());
            }else{
                for (int i = pos; i < k; i++) {
                    queue.addFirst(queue.pollLast());
                }
                list.add(queue.pollLast());
            }
            count++;
            if (count % m == 0) {
                dir = (dir == 0) ? 1 : 0;
            }
            // 1 2 3 4 5 6 7
        }
        for (int x : list) {
            System.out.println(x);
        }
    }
}