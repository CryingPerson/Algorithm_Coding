import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();

        int len = a.length();

        char[][] ch = new char[5][len * 4 + 1];

        for (int i = 0; i < 5; i++) {
            Arrays.fill(ch[i], '.');
        }

        for (int i = 0; i < len; i++) {
            char deco = (i + 1) % 3 == 0 ? '*' : '#';

            int paint = (i * 4) + 2;

            int[][] pos = {
                    {0,paint}, {1,paint-1}, {1, paint + 1}, {2, paint -2}
                    ,{2, paint + 2}, {3, paint - 1}, {3, paint + 1}, {4, paint}
            };

            for (int[] po : pos) {
                int x = po[0]; int y = po[1];

                if(ch[x][y] != '*'){
                    ch[x][y] = deco;
                }
            }
            ch[2][paint] = a.charAt(i);

        }
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < ch[0].length; j++) {
                System.out.print(ch[i][j]);
            }
            System.out.println();
        }
    }
}