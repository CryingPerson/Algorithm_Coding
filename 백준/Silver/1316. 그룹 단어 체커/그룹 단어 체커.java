import java.util.*;

public class Main {
    static int[][] board;
    static int nxK = 0;
    static int nyK = 0;
    static int nstoneXK = 0;
    static int nstobeYK = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();
        int ans = 0;

        for (int i = 0; i < N; i++) {
            String st = sc.nextLine();
            if(check(st)){
                ans++;
            }
        }
        System.out.println(ans);
    }

    public static boolean check(String string) {
        boolean[] check = new boolean[26];
        for (int i = 0; i < string.length() - 1; i++) {
            check[string.charAt(i) - 'a'] = true;
            if (string.charAt(i) != string.charAt(i + 1)) {
                if(check[string.charAt(i+1) - 'a']) return false;
            }
        }
        return true;
    }
}
