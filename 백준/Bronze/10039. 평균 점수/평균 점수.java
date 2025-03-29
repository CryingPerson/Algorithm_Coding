import java.util.*;

public class Main {
    static int[][] board;

    public static int[] dx = {-2, -2, 0, 0, 2, 2};
    public static int[] dy = {-1, 1, -2, 2, -1, 1};
    public static int r1;
    public static int c1;
    public static int r2;
    public static int c2;
    public static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            int score = sc.nextInt();
            if(score < 40){
                arr[i] = 40;
            }else arr[i] = score;
        }
        System.out.println(Arrays.stream(arr).sum()/ 5);

    }
}