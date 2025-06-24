import java.nio.IntBuffer;
import java.util.*;

public class Main {
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1}; // 오른쪽, 아래
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    static char[][] board;
    static boolean[][] checked;
    static int xx;
    static int yy;
    static int[][] ans;
    static int[] alpabet = {3, 2, 1, 2, 4, 3, 1, 3, 1, 1, 3, 1, 3, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        int[] comapre = new int[n];
        for (int i = 0; i < n; i++) {

            Integer[] temp = new Integer[m];
            for (int j = 0; j < m; j++) {
                temp[j] = sc.nextInt();
            }

            Arrays.sort(temp, Collections.reverseOrder());

            for (int j = 0; j < m; j++) {
                arr[i][j] = temp[j];
            }
        }


        for (int i = 0; i < m; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < n; j++) {
                max = Math.max(max, arr[j][i]);
            }
            check(max, i, comapre, arr);
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < comapre.length; i++) {
            if(comapre[i] > max) max = comapre[i];
        }

        List<Integer>list =new LinkedList<>();
        for (int i = 0; i < comapre.length; i++) {
            if(comapre[i] == max){
                list.add(i + 1);
            }
        }
        Collections.sort(list);
        for (int x : list) {
            System.out.print(x + " ");
        }
    }

    static void check(int num, int s, int[] arr, int[][] se) {
        for (int j = 0; j < se.length; j++) {
            if (se[j][s] == num) {
                arr[j]++;
            }
        }
    }
}

