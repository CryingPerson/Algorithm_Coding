import javax.swing.plaf.ButtonUI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N, M;
    static int[][] board;
    static int[] dx = {-1, 0, 1, 0}; // 북 동 남 서
    static int[] dy = {0, 1, 0, -1};
    static int cleaned = 0;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] answer = new int[9];
        for (int i = 0; i < 9; i++) {
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }

            Arrays.sort(arr);

            answer[i] = arr[arr.length - 1];
        }
        int max = -1;
        int find = -1;
        for (int i = 0; i < 9; i++) {
            if(answer[i] > max){
                max = answer[i];
                find = i;
            }
        }

        String[] sss = {"PROBRAIN", "GROW", "ARGOS", "ADMIN", "ANT", "MOTION", "SPG", "COMON", "ALMIGHTY"};

        System.out.println(sss[find]);



    }
}