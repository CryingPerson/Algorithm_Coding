import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static char[] Adrian = {'A', 'B', 'C'};
    static char[] Bruno = {'B', 'A', 'B', 'C'};
    static char[] Goran = {'C', 'C', 'A', 'A', 'B', 'B'};

    static int[] fibos;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String s = sc.nextLine();
            if(s.equals("#")) break;

            int cnt = 0;

            int check = 0;
            for (char c : s.toCharArray()) {
                if(c == '1') cnt++;
                else if(c == 'e') check = 0;
                else if(c == 'o') check = 1;
            }
            String ans = "";
            if (check == 0) {
                ans = s.substring(0, s.length() - 1);
                if (cnt % 2 != 0) {
                    ans += '1';
                }else ans += '0';
            }else{
                ans = s.substring(0, s.length() - 1);
                if (cnt % 2 != 0) {
                    ans += '0';
                }else ans += '1';
            }
            System.out.println(ans);
        }
    }
}