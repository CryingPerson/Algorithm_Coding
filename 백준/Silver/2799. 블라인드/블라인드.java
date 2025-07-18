import java.util.*;

public class Main {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int aaaasd = 0;
    static boolean[][] check;
    static String[][] st = {{".",".",".","."}, {".",".",".","."}, {".",".",".","."}, {".",".",".","."}};
    static String[][] st2 = {{"*","*","*","*"}, {".",".",".","."}, {".",".",".","."}, {".",".",".","."}};
    static String[][] st3 = {{"*","*","*","*"}, {"*","*","*","*"}, {".",".",".","."}, {".",".",".","."}};
    static String[][] st4 = {{"*","*","*","*"}, {"*","*","*","*"}, {"*","*","*","*"}, {".",".",".","."}};
    static String[][] st5 = {{"*","*","*","*"}, {"*","*","*","*"}, {"*","*","*","*"}, {"*","*","*","*"}};
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt(); int y = sc.nextInt();

        sc.nextLine();
        arr = new int[5];


        int cowLength = 5 * y + 1;
        int rowLength = 5 * x + 1;
        check = new boolean[rowLength][cowLength];
        String[][] board = new String[rowLength][cowLength];

        for (int i = 0; i < rowLength; i++) {
            char[] charArray = sc.nextLine().toCharArray();
            for (int j = 0; j < cowLength; j++) {
                board[i][j] = String.valueOf(charArray[j]);
            }
        }
        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < cowLength; j++) {
                if(!check[i][j] && (board[i][j].equals("*") || board[i][j].equals("."))){
                    simul(board,i,j);
                    j += 4;
                }
            }
        }
        for(int xx : arr) System.out.print(xx + " ");
    }

    static void simul(String[][] board, int x, int y) {
        String[][] as = new String[4][4];
        int a = 0;
        int b = 0;
        for (int i = x; i < x + 4; i++) {
            for (int j = y; j < y + 4; j++) {
                check[i][j] = true;
                as[a][b] = board[i][j];
                b++;
            }
            b = 0;
            a++;
        }
        compare(as);
    }

    static void compare(String[][] aa) {
        if(Arrays.deepEquals(aa, st)) {
            arr[0]++;
        }else if(Arrays.deepEquals(aa, st2)){
            arr[1]++;
        }else if(Arrays.deepEquals(aa, st3)){
            arr[2]++;
        }else if(Arrays.deepEquals(aa, st4)){
            arr[3]++;
        }else{
            arr[4]++;
        }
    }
}