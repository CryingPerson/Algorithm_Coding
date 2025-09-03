import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();

            int num = cha(s.split("-")[0]);
            int comparte = Integer.parseInt(s.split("-")[1]);

            System.out.println(Math.abs(comparte - num) <= 100 ? "nice" : "not nice");
        }
    }

    static int cha(String s) {
        int inx = 2;
        int total = 0;
        for (char c : s.toCharArray()) {
            int n = (c - 'A');
           total += (int) (n * Math.pow(26, inx--));
        }
        return total;
    }

}