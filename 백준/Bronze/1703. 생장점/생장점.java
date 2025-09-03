import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();

            if(n == 0) break;

            int cur = 1;

            for (int i = 0; i < n; i++) {
                int count = sc.nextInt(); int cut = sc.nextInt();

                cur *= count;
                cur -= cut;
            }
            System.out.println(cur);
        }
    }

}