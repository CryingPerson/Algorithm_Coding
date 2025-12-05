import java.util.*;

class Main {
    static int[][] board;
    static int x, y;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static List<int[]> temp;

    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String s = sc.next();

        if (n < 26) {
            System.out.println(s);
            return;
        }

        String first = s.substring(0, 11);
        String last = s.substring(s.length() - 11);

        String mid = s.substring(11, s.length() - 11);

        StringBuilder sb = new StringBuilder();
        String ss = "......";
        String sss = "...";
        String[] split = mid.split("\\.");
        int count = 0;
        if(split.length > 1){
            first = s.substring(0, 9);
            last = s.substring(s.length() - 10);
            sb.append(first).append(ss).append(last);
        }else{
            sb.append(first).append(sss).append(last);
        }
        System.out.println(sb);
    }
}