import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = -1;
        boolean flag = false;
        int start = 1;
        int end = 10;
        boolean check = false;

        while (true) {
            if (flag) {
                if (check) {
                    System.out.println("Stan is dishonest");
                } else {
                    System.out.println("Stan may be honest");
                }
                start = 1;
                end = 10;
                check = false;
                flag = false;
            }

            String s = sc.nextLine();
            if (s.equals("0")) break;

            num = Integer.parseInt(s);
            String he = sc.nextLine();

            if (he.contains("high")) {
                if(num < start) check = true;
                end = Math.min(end, num - 1);
            } else if (he.contains("low")) {
                if(num > end) check = true;
                start = Math.max(start, num+1);
            } else {
                if (num < start || num > end) check = true;
                flag = true;
            }
        }
    }
}
