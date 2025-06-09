import java.util.*;

public class Main {
    static int[] dx = {1, 0, -1, 0}; // 남, 서, 북, 동
    static int[] dy = {0, -1, 0, 1};
    static int[] alpabet = {3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idx = 1;
        while (true) {
            int N = sc.nextInt();
            if (N == 0) return;

            List<String> list = new LinkedList<>();
            sc.nextLine();
            String[] st = new String[N+1];
            boolean[] check = new boolean[N+1];
            for (int i = 0; i < N; i++) {
                String name = sc.nextLine();
                st[i+1] = name;
            }
            for (int i = 0; i < 2 * N - 1; i++) {
                int number = sc.nextInt();
                String alpabet = sc.nextLine();
                check[number] = !check[number];
            }
            for (int i = 1; i <= N; i++) {
                if(check[i]){
                    list.add(st[i]);
                }
            }
            System.out.print(idx++ + " ");
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}
