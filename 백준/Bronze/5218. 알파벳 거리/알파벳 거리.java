import java.util.*;
import java.util.function.IntBinaryOperator;

public class Main {
    static char[] arr = {'A', 'B', 'C', 'D'};
    static int L = 2;

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static char[][] board;
    static int max = 0;
    static List<int[]> list = new ArrayList<>();
    static List<int[]> viruous = new ArrayList<>();
    static int n, m;
    static int[] number;
    static int mins = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String[] s = sc.nextLine().split(" ");
            System.out.print("Distances: ");
            for (int j = 0; j < s[0].length(); j++) {
                if(s[0].charAt(j) <= s[1].charAt(j)){
                    int i1 = s[1].charAt(j) - s[0].charAt(j);
                    System.out.print(i1);
                }else{
                    int i1 = (s[1].charAt(j) + 26) - s[0].charAt(j);
                    System.out.print(i1);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
