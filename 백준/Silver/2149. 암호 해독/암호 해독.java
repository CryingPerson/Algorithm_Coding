import java.util.*;

public class Main {
    static char[][] board;
    static int a1 = 0;
    static int b1 = 0;
    static boolean[][] booleans;
    static int[] dx = {-1 ,0 ,1 ,0};
    static int[] dy = {0, 1, 0, -1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String key = sc.nextLine();

        List<info> list = new ArrayList<>();



        for (int i = 0; i < key.length(); i++) {
            list.add(new info(String.valueOf(key.charAt(i)), i));
        }

        list.sort((a, b) -> {
            if (!a.name.equals(b.name)) return a.name.compareTo(b.name);
            return a.idx - b.idx;
        });

        String password=  sc.nextLine();

        int x = password.length() / key.length();
        int y = key.length();
        board = new char[x][y];

        int idx = 0;
        for (int i = 0; i < y; i++) {
            int inddxx = list.get(i).idx;
            for (int j = 0; j < x; j++) {
                board[j][inddxx] = password.charAt(idx++);
            }
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(board[i][j]);
            }
        }

    }
}
class info{
    String name;
    int idx;

    public info(String name, int indx) {
        this.name = name;
        this.idx = indx;
    }
}
