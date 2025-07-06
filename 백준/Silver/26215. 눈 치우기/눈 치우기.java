import java.util.*;

public class Main {

    static char[][] board;
    static int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
    static int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
    static Set<String> strings = new HashSet<>();
    static int max = Integer.MIN_VALUE;
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            q.add(sc.nextInt());
        }

        int cnt = 0;
        if(q.size() == 1){
            int x = q.poll();
            if(x <= 1440) System.out.println(x);
            else System.out.println(-1);
            return;
        }
        while (!q.isEmpty()) {
            if(q.size() == 1){
                cnt += q.poll();
                break;
            }
            int num = q.poll();
            int poll = q.poll();

            num--;
            poll--;

            if(num != 0) q.add(num);
            if(poll != 0) q.add(poll);

            cnt++;
        }
        if(cnt <= 1440) System.out.println(cnt);
        else System.out.println(-1);
    }
}

