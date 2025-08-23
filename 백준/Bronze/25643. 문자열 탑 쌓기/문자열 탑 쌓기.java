import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);
        // abc bca cab
        // acb cba
        int n = sc.nextInt(); int m = sc.nextInt();

        sc.nextLine();
        String first = sc.nextLine();
        for (int i = 1; i < n; i++) {
            String word = sc.nextLine();
            if(!check(first, word)){
                System.out.println(0);
                return;
            }
            first = word;
        }
        System.out.println(1);
    }

    static boolean check(String a1, String a2) {
        for (int i = 1; i <= a1.length(); i++) {
            if (a1.substring(0, i).equals(a2.substring(a2.length() - i))
                    || a1.substring(a1.length() - i).equals(a2.substring(0, i))) {
                return true;
            }
        }
        return false;
    }
}