import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt(); int y = sc.nextInt();

        sc.nextLine();
        char[][] board = new char[x][y];
        for (int i = 0; i < x; i++) {
            char[] line = sc.nextLine().toCharArray();
            for (int j = 0; j < y; j++) {
                board[i][j] = line[j];
            }
        }
        List<String> list = new ArrayList<>();
        int len  = y;
        for (int i = 0; i < x; i++) {
            String s = "";
            for (int j = 0; j < y; j++) {
                if(board[i][j] != '#') {
                    s += board[i][j];
                }else{
                    if(s.length() > 1) {
                        list.add(s);
                    }
                    s = "";
                }
                if(j == y - 1 && s.length() > 1) list.add(s);
            }
        }

        int len2 = x;
        for (int i = 0; i < y; i++) {
            String s = "";
            for (int j = 0; j < x; j++) {
                if(board[j][i] != '#'){
                    s += board[j][i];
                }else{
                    if(s.length() > 1) {
                        list.add(s);
                    }
                    s = "";
                }
                if(j == x - 1 && s.length() > 1) list.add(s);
            }
        }
        Collections.sort(list);

        System.out.println(list.get(0));
    }
}
