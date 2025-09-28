import java.io.IOException;
import java.util.*;

class Main {
    static char[][] board;

    static String[] months = { "Thursday", "Friday", "Saturday", "Sunday","Monday", "Tuesday", "Wednesday"};
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        Set<Integer> set = new HashSet<>();

        int n = sc.nextInt(); int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int num = sc.nextInt();
            int pos = 1;
            while (true) {
                int result = pos * num;
                if(result > n) break;
                set.add(result);
                pos++;
            }
        }
        int answer = 0;
        for(int x : set) answer += x;
        System.out.println(answer);

    }
}