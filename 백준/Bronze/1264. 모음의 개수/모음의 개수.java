import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] c = {'i','e','o','u','a'};
        while (true) {
            String s = sc.nextLine();
            if(s.equals("#")) break;

            int cnt = 0;
            s = s.toLowerCase();
            for(char cc : s.toCharArray()){
                for (int i = 0; i < c.length; i++) {
                    if(cc == c[i]) cnt++;
                }
            }
            System.out.println(cnt);
        }

    }
}
