import java.util.*;

public class Main {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int aaaasd = 0;
    static boolean[][] check;
    static String[][] st = {{".",".",".","."}, {".",".",".","."}, {".",".",".","."}, {".",".",".","."}};
    static String[][] st2 = {{"*","*","*","*"}, {".",".",".","."}, {".",".",".","."}, {".",".",".","."}};
    static String[][] st3 = {{"*","*","*","*"}, {"*","*","*","*"}, {".",".",".","."}, {".",".",".","."}};
    static String[][] st4 = {{"*","*","*","*"}, {"*","*","*","*"}, {"*","*","*","*"}, {".",".",".","."}};
    static String[][] st5 = {{"*","*","*","*"}, {"*","*","*","*"}, {"*","*","*","*"}, {"*","*","*","*"}};
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int max = -1;
        for (int length = 2; length <= s.length(); length += 2) {
            for (int i = 0; i + length <= s.length(); i++) {
                int mid = i + length /2;

                String a1 = s.substring(i, mid);
                String a2 = s.substring(mid, length + i);

                int sum1 = 0;
                int sun2 = 0;
                for (int j = 0; j < a1.length(); j++) {
                    sum1 += a1.charAt(j) - '0';
                    sun2 += a2.charAt(j) - '0';
                }

                if(sum1 == sun2){
                    if(max < length){
                        max = length;
                    }
                }

            }
                // 0,1 1,2
                // 2,3 3,4
        }
        if(max == -1){
            System.out.println(0);
            return;
        }
        System.out.println(max);
    }
}
