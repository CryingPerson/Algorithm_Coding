import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int len = s.length();

        List<String> list = new LinkedList<>();
        for (int i = 1; i < len - 1; i++) {
            for (int j = i+1; j < len; j++) {
                String substring = new StringBuilder(s.substring(0, i)).reverse().toString();
                String substring1 = new StringBuffer(s.substring(i, j)).reverse().toString();
                String substring2 = new StringBuilder(s.substring(j)).reverse().toString();

                String ans = substring + substring1 + substring2;
                list.add(ans);
            }
        }
            Collections.sort(list);

        System.out.println(list.get(0));
    }
}
