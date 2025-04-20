import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static int n;
    static int[] ans;
    static int[][] board;
    static Set<String> list = new HashSet<>();
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.nextLine();

        List<info> list1 = new LinkedList<>();
        for(int i = 0; i < n; i++) {
            String name = sc.next();
            int date = sc.nextInt();
            int month = sc.nextInt();
            int year = sc.nextInt();

            list1.add(new info(name, date, month, year));
        }
        list1.sort((o1, o2) -> {
            if(o1.year != o2.year) return o2.year - o1.year;
            if(o1.month != o2.month) return o2.month - o1.month;
            return o2.date - o1.date;
        });
        System.out.println(list1.get(0).name);
        System.out.println(list1.get(list1.size() - 1).name);
    }
}
class info{
    String name; int date; int month; int year;
    public info(String name, int date, int month, int year) {
        this.name = name; this.date = date; this.month = month; this.year = year;
    }
}