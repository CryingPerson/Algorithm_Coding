import java.util.*;

public class Main {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] board;
    static int n;
    static int cc = 1;
    static List<List<Integer>> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        StringBuilder sb = new StringBuilder();

        StringBuilder ss = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(c == ' '){
                sb.append(new StringBuilder(ss.toString()).reverse()).append(" ");
                ss = new StringBuilder();
                continue;
            }
            if(c == '<'){
                sb.append(new StringBuilder(ss.toString()).reverse());
                ss = new StringBuilder();
                sb.append('<');
                while (true) {
                    i++;
                    c = s.charAt(i);
                    if(c == '>'){
                        sb.append('>');
                        break;
                    }sb.append(c);
                }
            }else{
                ss.append(c);
            }
        }
        if (ss.length() != 0) {
            sb.append(new StringBuilder(ss.toString()).reverse());
        }
        System.out.println(sb);
    }

}