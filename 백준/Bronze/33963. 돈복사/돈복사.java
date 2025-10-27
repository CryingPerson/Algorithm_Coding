import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num = sc.nextLine();

        int len = num.length();

        long limit = (long)Math.pow(10, len);

        int a = Integer.parseInt(num);
        int count = 0;
        while (a * 2 < limit) {
            count++;
            a *= 2;
        }
        System.out.println(count);
    }
}