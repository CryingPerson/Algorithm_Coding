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


        int n = sc.nextInt();


        // 1 -> 2 ->
        int pre = 1;
        List<Integer> list = new ArrayList<>();
        list.add(pre);
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt(); int y = sc.nextInt();
            if(x == pre || y == pre){
                if(x == pre) {
                    list.add(y);
                    pre = y;
                }
                else {
                    list.add(x);
                    pre = x;
                }
            }
        }
        System.out.println(list.get(list.size() - 1));
    }
}
