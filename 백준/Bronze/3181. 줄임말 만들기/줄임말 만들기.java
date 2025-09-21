import java.util.*;
class Main {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static boolean[][] snake;
    static int[][] board;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String[] st = {"i", "pa", "te", "ni", "niti", "a", "ali", "nego", "no", "ili"};

        String[] split = s.split(" ");

        StringBuilder sb  =new StringBuilder();
        int idx = 0;
        for (String ss : split) {
            boolean ok = true;
            for (int i = 0; i < st.length; i++) {
                if(ss.equals(st[i]) && idx != 0) {
                    ok = false;
                    break;
                }
            }
            idx++;
            if(ok) sb.append(Character.toUpperCase(ss.charAt(0)));
        }
        System.out.println(sb);
    }
}