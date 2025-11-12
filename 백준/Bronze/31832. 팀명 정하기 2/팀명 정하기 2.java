import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();

            if(s.length() > 10) continue;

            int de = 0; int so = 0; int alplabet = 0;
            for (char c : s.toCharArray()) {
                if(!Character.isDigit(c)) alplabet++;
                if(Character.isUpperCase(c)) de++;
                if(Character.isLowerCase(c)) so++;
            }

            if(de > so) continue;

            if(alplabet == 0) continue;

            System.out.println(s);
            break;
        }
    }
}


