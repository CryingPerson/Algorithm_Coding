import java.util.*;
class Main {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static boolean[][] snake;
    static int[][] board;
    static char[][] star;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a1 = sc.nextLine();
        String a2 = sc.nextLine();
        String a3 = sc.nextLine();

        int a = check(a1);
        int b = check(a2);
        int c=  check(a3);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    // 23222
    static int check(String a1) {
        int max = -1;
        for (int i = 0; i < a1.length(); i++) {
            char c = a1.charAt(i);
            int count = 0;
            for (int j = 0; j < a1.length(); j++) {
                char cc = a1.charAt(j);
                if (c == cc) {
                    count++;
                } else {
                    max = Math.max(max, count);
                    count = 0;
                }
            }
            max = Math.max(max, count);
        }
        return max;

    }
}