import java.sql.ClientInfoStatus;
import java.util.*;

class Main {
    static String[][] board;
    static int[][] origin;
    static List<int[]> temp;
    static boolean end = true;

    static int Size = 0;
    static int n, m, d;
    static List<int[]> removePoint;
    static int max = -1;

    static List<int[]> teacher;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static boolean[]visited;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        String explosive = sc.next();

        Stack<Character> strings = new Stack<>();

        for (int i = s.length() - 1; i >= 0; i--) {
            strings.push(s.charAt(i));
        }

        int len = explosive.length();

        StringBuilder sb = new StringBuilder();

        StringBuilder check = new StringBuilder();
        while (!strings.isEmpty()) {
            sb.append(strings.pop());

            if(sb.length() >= len) {
                String substring = sb.substring(sb.length() - len);
                if(substring.equals(explosive)){
                    sb.delete(sb.length() - len,sb.length());
                }
            }
        }
        if(sb.toString().isEmpty()){
            System.out.println("FRULA");
        }else System.out.println(sb);
    }
}