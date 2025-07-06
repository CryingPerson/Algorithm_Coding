import java.util.*;

public class Main {

    static char[][] board;
    static int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
    static int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
    static Set<String> strings = new HashSet<>();
    static int max = Integer.MIN_VALUE;
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String word = sc.nextLine();
            if(word.equals("*")) break;

            if(check(word)){
                System.out.println(word + " is surprising.");
            }else{
                System.out.println(word + " is NOT surprising.");
            }
        }
    }

    static boolean check(String s) {
        if(s.length() == 1 || s.length() == 2) return true;

        for (int i = 0; i < s.length(); i++) {
            Set<String> set = new HashSet<>();
            for (int j = 0; j < s.length(); j++) {
                if(j + i + 1 >= s.length()) continue;
                String substring = String.valueOf(s.charAt(j)) + String.valueOf(s.charAt(j + i + 1));
                if(set.contains(substring)) return false;
                set.add(substring);
            }
        }
        return true;
    }
}

