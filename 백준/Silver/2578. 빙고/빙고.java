import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static int n;
    static int[] ans;
    static int[][] board;
    static int[][] talk;
    static Set<String> list = new HashSet<>();

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        board = new int[5][5];
        talk = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                board[i][j] = sc.nextInt();
            }
        }


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                talk[i][j] = sc.nextInt();
            }
        }

        int sumCount = 0;
        boolean[][]making = new boolean[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                sumCount++;

                int called = talk[i][j];

                int r = -1; int c = -1;
                for (int x = 0; x < 5; x++) {
                    for(int y = 0; y < 5; y++) {
                        if(board[x][y] == called){
                            r = x; c = y;
                            break;
                        }
                    }
                    if(r != -1) break;
                }

                making[r][c] = true;

                int bingoLines = 0;

                for (int x = 0; x < 5; x++) {
                    boolean full = true;
                    for(int y = 0; y < 5; y++) {
                        if(!making[x][y]) {
                            full = false;
                            break;
                        }
                    }
                    if(full) bingoLines++;
                }

                for (int x = 0; x < 5; x++) {
                    boolean full = true;
                    for(int y = 0; y < 5; y++) {
                        if(!making[y][x]) {
                            full = false;
                            break;
                        }
                    }
                    if(full) bingoLines++;
                }
                boolean fullDiga1 = true;
                for(int x = 0; x < 5; x++) {
                    if(!making[x][x]) {
                        fullDiga1 = false;
                    }
                }
                if(fullDiga1) bingoLines++;
                boolean fullDiga2 = true;

                for(int x = 0; x < 5; x++) {
                    if(!making[x][4-x]){
                        fullDiga2 = false;
                    }
                }
                if(fullDiga2) bingoLines++;

                if(bingoLines >= 3){
                    System.out.println(sumCount);
                    return;
                }
            }
        }

    }
}
