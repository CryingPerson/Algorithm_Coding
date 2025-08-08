import java.util.*;

public class Main {
    static String[][] time;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); int m = sc.nextInt();

        sc.nextLine();

        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            String wd = sc.nextLine();
            strings[i] = wd;
        }

        for (int i = 0; i < n; i++) {
            String ss = sc.nextLine();
            String string = strings[i];

            String fix = "";
            for (int j = 0; j < string.length(); j++) {
                for (int k = 0; k < 2; k++) {
                    fix += string.charAt(j);
                }
            }
            if(!ss.equals(fix)){
                System.out.println("Not Eyfa");
                return;
            }
        }
        System.out.println("Eyfa");

    }
}
