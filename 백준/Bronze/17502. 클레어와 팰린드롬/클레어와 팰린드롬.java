import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.DoubleConsumer;

public class Main {
    static int[] arr = new int[3];
    static int x,y,z;
    static int[][][] tomato;
    static boolean[] use;
    static int[][] board;
    static List<int[]> point = new LinkedList<>();
    static List<int[]> avoidHome = new LinkedList<>();
    static int[] dx = {-1 , 0 , 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static long max = Integer.MIN_VALUE;
    static int k;
    static List<int[]> list;
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.nextLine();

        String s = sc.nextLine();

        int left = 0; int right = n - 1;
        char[] arr = s.toCharArray();
        while (left <= right) {
            if(arr[left] == '?' && arr[right] == '?'){
                arr[left] = 'a'; arr[right] = 'a';
            }else if(arr[left] == '?' && arr[right] != '?'){
                arr[left] = arr[right];
            }else if(arr[left] != '?' && arr[right] == '?'){
                arr[right] = arr[left];
            }
            left++;
            right--;
        }
        System.out.println(arr);
    }
}

