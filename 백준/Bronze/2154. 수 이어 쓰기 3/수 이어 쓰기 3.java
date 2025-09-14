import java.util.*;

public class Main {
    static int[] dx = {1, 0 ,-1 ,0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s =sc.nextLine();

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= Integer.parseInt(s); i++) {
            sb.append(i);
        }

        String ans = sb.toString();
        
        for (int i = 0; i <= ans.length() - s.length(); i++) {
            String as = ans.substring(i, i + s.length());
            if(s.equals(as)){
                System.out.println(i + 1);
                return;
            }
        }
    }
}
