import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String answer = answer(n);
        System.out.println(answer);

    }
    public static String answer(int n) {
        return n == 0 ? "YONSEI" : "Leading the Way to the Future";
    }
}
