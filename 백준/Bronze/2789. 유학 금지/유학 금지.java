import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String ans = s.replaceAll("[CAMBRIDGE]", "");
        System.out.println(ans);
    }
}
