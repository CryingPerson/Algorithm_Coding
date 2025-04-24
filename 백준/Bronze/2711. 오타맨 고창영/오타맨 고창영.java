import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    static int n;
    static int[] ans;
    static char[][] board;
    static int[][] talk;
    static Set<String> list = new HashSet<>();

    static long[] save = new long[9000001];

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            int idx = sc.nextInt(); String wrongWord = sc.next();

            if(wrongWord.length() == idx){
                String substring = wrongWord.substring(0, idx-1);
                System.out.println(substring);
            }else{
                String answer = wrongWord.substring(0, idx-1) + wrongWord.substring(idx);
                System.out.println(answer);
            }
        }
    }
}
