import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] board = new int[n][m];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (i + 2 < board.length && j + 2 < board[0].length) {
                    int a = get(i, j, board);
                    list.add(a);
                }
            }
        }
        int k = sc.nextInt();
        int cnt = 0;
        for (int li : list) {
            if(k <= li) cnt++;
        }
        System.out.println(cnt);
    }
    static int get(int x, int y, int[][] board){
        List<Integer> list = new ArrayList<>();
        for (int i = x; i < x + 3; i++) {
            for (int j = y; j < y + 3; j++) {
                list.add(board[i][j]);
            }
        }
        Collections.sort(list);
        return list.get(list.size()/2);
    }
}

