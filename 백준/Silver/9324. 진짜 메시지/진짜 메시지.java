import java.util.*;

public class Main {

    static char[][] board;
    static int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
    static int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
    static Set<String> strings = new HashSet<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            s += " ";
            if (check(s)) {
                System.out.println("OK");
            } else {
                System.out.println("FAKE");
            }
        }
    }

    static boolean check(String s) {
         Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.getOrDefault(c, 0) + 1);
                int count = map.get(c);

                if(count == 3){
                    if(s.charAt(i) != s.charAt(i+1)) return false;
                    map.put(c, -1);
                }
            }else{
                map.put(c, 1);
            }
        }
        return true;
    }
}

