import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.nextLine();
        int max = 0;
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            int count = 0;
             s= s.replace("for", "*").replace("while","*");

            for(char c : s.toCharArray()) if(c == '*') count++;

            if (count > max) {
                max = count;
            }
        }
        System.out.println(max);
    }
}


