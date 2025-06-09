import java.util.*;

public class Main {
    static int N;
    static char[][] graph;
    static boolean[][] visited;
    static int[][] result;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int L = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int[] arr = new int[11];
        for (char ch : s.toCharArray()) {
            if(ch =='6'){
                arr['9' - '0']++;
            }else{
                arr[ch - '0']++;
            }
        }
        int max = -1;
        int compare = -1;
        for (int i = 0; i <= 10; i++) {
            if (i == 6 || i == 9) {
                compare = (int)Math.ceil((double) arr[i] / 2);
                if (compare > max) max = compare;
            } else {

                compare = arr[i];
                if (compare > max) max = compare;

            }
        }
        System.out.println(max);
    }
}
