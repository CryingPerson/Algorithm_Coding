
import java.text.NumberFormat;
import java.util.*;

class Main {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static boolean[][] snake;
    static int[][] board;
    static char[][] star;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int person = sc.nextInt(); int check = sc.nextInt();

            if (!map.containsKey(person)) {
                if (check == 0) {
                    ans++;
                    map.put(person, check);
                }else{
                    map.put(person , 1);
                }
            }else{
                if(check == map.get(person)){
                    ans++;
                }else{
                    map.put(person, check);
                }
            }
        }
        for (int state : map.values()) {
            if (state == 1) ans++;
        }

        System.out.println(ans);
    }
}