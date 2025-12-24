import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
class Main {
    static int max = Integer.MIN_VALUE;

    static int hihi = -1;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.next();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine().toLowerCase();

            int[] alpabet = new int[26];

            for (char c : s.toCharArray()) {
                if(Character.isAlphabetic(c)){
                    alpabet[c - 'a']++;
                }
            }

            StringBuilder sb = new StringBuilder();

            sb.append("missing ");
            for (int j = 0; j < 26; j++) {
                if(alpabet[j] == 0){
                    sb.append((char)('a' + j));
                }
            }
            if(sb.toString().equals("missing ")){
                System.out.println("pangram");
            }else
            System.out.println(sb);
        }
    }
}