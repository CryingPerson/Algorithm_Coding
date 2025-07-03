import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String s = sc.next();
            String p = sc.next();

            int cnt = 0;

            s = s.replaceAll(p, "*");
            System.out.println(s.length());
        }
    }
}

