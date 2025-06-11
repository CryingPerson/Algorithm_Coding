import java.util.*;

public class Main {
    static int[] arr;
    static int[] ans;
    static boolean[] check;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        sc.nextLine();
        String word = sc.nextLine();
        int cnt = 0;
        int[] baseCount = getRange(word);
        for (int i = 1; i < N; i++) {
            String ss = sc.nextLine();
            int[] range = getRange(ss);

            int diff = 0;

            for (int j = 0; j < 26; j++) {
                diff += Math.abs(baseCount[j] - range[j]);
            }

            if (diff <= 1 || (diff == 2 && word.length() == ss.length())) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    static int[] getRange(String s) {
        int[] alpabet = new int[26];

        for (char ch : s.toCharArray()) {
            alpabet[ch - 'A']++;
        }
        return alpabet;
    }
}
