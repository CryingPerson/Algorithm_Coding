import java.util.Scanner;

public class Main {
    static char[][] board;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
         board = new char[n][m];

        for (int i = 0; i < n; i++) {
            board[i] = sc.nextLine().toCharArray();
        }

        int ans = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= n - 8; i++) {
            for (int j = 0; j <= m - 8; j++) {
                min =Math.min(brutoFoce(i,j) , min);
            }
        }
        System.out.println(min);

        sc.close();
    }
    public static int brutoFoce(int i, int j) {
        int w = 0;
        int B = 0;
        for (int a = i; a < i+8; a++) {
            for(int b = j; b < j+8; b++) {
                if((a+b) % 2 == 0){
                    if(board[a][b] == 'W') B++; 
                    if(board[a][b] == 'B') w++;
                }else{
                    if(board[a][b] == 'B') B++;
                    if(board[a][b] == 'W') w++;
                }
            }
        }
        return Math.min(w, B);
    }
}
