
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
    static int[] arrs;
    static int one = 0;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[] rank = new int[n];
        int[][] perSon = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                perSon[i][j] = kb.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            rank[i] = 1;
            for (int j = 0; j < n; j++) {
                if(perSon[i][0] < perSon[j][0] && perSon[i][1] < perSon[j][1]){
                    rank[i]++;
                }
            }
        }
        for(int x : rank){
            System.out.print(x + " ");
        }
    }
}

