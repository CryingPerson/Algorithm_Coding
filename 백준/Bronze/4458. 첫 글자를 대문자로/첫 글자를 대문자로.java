import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++){
            String s = sc.nextLine();
            char upperCase = Character.toUpperCase(s.charAt(0));
            String substring = s.substring(1);
            String s1 = upperCase + substring;
            System.out.println(s1);
        }
    }
}