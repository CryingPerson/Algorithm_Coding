import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt(); int y = sc.nextInt();

        String[][] board = new String[x][y];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                board[i][j] = String.valueOf(sc.nextInt());
            }
        }

        int count = 0;int max = -1;
        for (int i = 0; i < x; i++) {
            int cnt = 0;
            for (int j = 0; j < y; j++) {
                if(board[i][j].contains("9")){
                    for(char c : board[i][j].toCharArray()){
                        if(c == '9'){
                            cnt++;
                            count++;
                        }
                    }
                }
                max = Math.max(max, cnt);
            }
        }

        for (int i = 0; i < y; i++) {
            int cnt = 0;
            for (int j = 0; j < x; j++) {
                if(board[j][i].contains("9")){
                    for(char c : board[j][i].toCharArray()){
                        if(c == '9'){
                            cnt++;
                        }
                    }
                }
                max = Math.max(max, cnt);
            }
        }
        System.out.println(count - max);
    }
}