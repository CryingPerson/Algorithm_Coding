import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
class Main {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static boolean[][] snake;
    static int[][] board;
    static int n;
    static int count = 0;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

         n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int len = sc.nextInt();

            sb = new StringBuilder();
            DFS(len, "1", 1);
            System.out.println(sb);
        }

    }

    static void DFS(int len, String word, int depth) {
        if (len == depth) {
            if(valid(word) == 0){
                sb.append(word).append("\n");
            }
            return;
        }
        DFS(len, word + " " + (depth + 1), depth + 1);
        DFS(len, word + "+" + (depth + 1), depth + 1);

        DFS(len, word + "-" + (depth + 1), depth + 1);

    }

    static int valid(String word) {
        word = word.replaceAll(" ", "");

        StringTokenizer stw = new StringTokenizer(word,"+-",true);

        int i = Integer.parseInt(stw.nextToken());

        while (stw.hasMoreTokens()) {
            String op = stw.nextToken();

            int num = Integer.parseInt(stw.nextToken());

            if(op.equals("+")){
                i += num;
            }else{
                i -= num;
            }
        }
        return i;
    }
}