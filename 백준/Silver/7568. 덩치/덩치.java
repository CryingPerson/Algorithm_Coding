import javax.xml.crypto.dsig.keyinfo.KeyInfo;
import java.util.*;

class Main {
    public static int row;
    public static char[][] board;
    public static int col;

    public static ArrayList<ArrayList<Integer>> list;

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int T = kb.nextInt();

        int[][] person = new int[T][2];
        for (int i = 0; i < T; i++) {
            person[i][0] = kb.nextInt();
            person[i][1] = kb.nextInt();
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            int rank = 1;
            for (int j = 0; j < T; j++) {
                if(person[i][0] < person[j][0] &&
                person[i][1] < person[j][1]){
                    rank++;
                }
            }
            sb.append(rank).append(' ');
        }
        System.out.println(sb);
    }
}