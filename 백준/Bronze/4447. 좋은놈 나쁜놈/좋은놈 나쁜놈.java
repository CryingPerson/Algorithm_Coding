import java.util.*;

public class Main {
    static char[][] grid = new char[10][10];

    static boolean[][] visited;
    static int[][] board;
    static int likeCount = 0;
    static int n;
    static List<int[]> gabage2;
    static List<int[]> possible;
    static List<int[]> gabage;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n=  sc.nextInt();

        sc.nextLine();
        for (int i = 1; i <= n; i++) {
            String s = sc.nextLine();
            String temp = s;
            s = s.toLowerCase();

            int g = 0; int b = 0;

            for (char c : s.toCharArray()) {
                if(c == 'g') g++;
                else if(c == 'b')b++;
            }

            if(g > b){
                System.out.println(temp + " is " +"GOOD");
            }else if(g < b){
                System.out.println(temp + " is " + "A BADDY");
            }else System.out.println(temp + " is " +  "NEUTRAL");
        }
    }
}
