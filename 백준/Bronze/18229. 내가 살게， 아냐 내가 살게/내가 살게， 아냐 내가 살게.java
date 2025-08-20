import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); int m = sc.nextInt(); int k = sc.nextInt();

        int[] hands = new int[n];

        int[][] board = new int[n][m];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                hands[j] += board[j][i];

                if(hands[j] >= k){
                    System.out.print(j + 1 + " ");
                    System.out.println(i + 1);
                    return;
                }
            }

        }
    }
}
