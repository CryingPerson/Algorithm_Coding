import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(sc.next(), sc.next());
        }

        for (int i = 0; i < m; i++) {
            String s = sc.next();
            if(map.containsKey(s)){
                System.out.println(map.get(s));
            }
        }

    }
}
