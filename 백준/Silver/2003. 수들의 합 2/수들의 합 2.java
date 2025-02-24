
import java.awt.*;
import java.util.*;

public class Main {
    static int INF = Integer.MAX_VALUE;
    static int[] ch;
    static ArrayList<ArrayList<Integer>> list;
    static int m;
    static int n;
    static int[][] board;
    static int[][] dis;
    static int[] answer;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] ans;
    static int zero = 0;
    static int one = 0;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        int left = 0; int right = 0; int sum = 0; int cnt = 0;
        while (right < n){
            sum += arr[right];

            while (sum > m){
                sum -= arr[left++];
            }
            if(sum == m) cnt++;

            right++;
        }
        System.out.println(cnt);
    }

}

