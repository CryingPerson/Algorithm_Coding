import java.util.*;
import java.util.function.DoubleConsumer;

public class Main {
    static int[] arr = new int[3];
    static int x,y,z;
    static int[][][] tomato;
    static boolean[][] visited;
    static List<int[]> point = new LinkedList<>();
    static int[] dx = {-1 , 0 , 1, 0};
    static int[] dy = {0, 1, 0, -1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int cur = n;
        int number = 1;
        int count = 0;
        while (n >= 10) {
            while (cur > 0) {
                number = number * (cur % 10);
                cur /= 10;
            }
            count++;
            n = number;
            cur = number;
            number = 1;
        }
        System.out.println(count);


    }
}
