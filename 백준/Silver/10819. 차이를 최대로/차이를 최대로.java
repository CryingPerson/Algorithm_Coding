import java.util.*;

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
    static int total = 0;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        number = new int[n];
        for(int i = 0; i < n; i++) number[i] = sc.nextInt();
        visited = new boolean[n];
        sunul(0, new int[number.length]);

        System.out.println(max);
    }

    static void sunul(int depth, int[] arr) {
        if (depth == number.length) {
            int ss = simul(arr);
            max = Math.max(max, ss);
        }else{
            for (int i = 0; i < number.length; i++) {
                if(!visited[i]){
                    arr[depth] = number[i];
                    visited[i] = true;
                    sunul(depth + 1, arr);
                    visited[i] = false;
                }
            }
        }
    }

    static int simul(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            sum += Math.abs((arr[i] - arr[i + 1]));
        }
        return sum;
    }
}
