import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    static char[] Adrian = {'A', 'B', 'C'};
    static char[] Bruno = {'B', 'A', 'B', 'C'};
    static char[] Goran = {'C', 'C', 'A', 'A', 'B', 'B'};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String s = sc.nextLine();
            if(s.equals("*")) break;
            boolean ok = true;

            int[] alpabet = new int[26];
            for(char c : s.toCharArray()) {
                if(c == ' ') continue;
                alpabet[c-'a']++;
            }

            for (int i = 0; i < 26; i++) {
                if(alpabet[i] == 0){
                    System.out.println("N");
                    ok = false;
                    break;
                }
            }
            if(ok) System.out.println("Y");
        }
    }
}