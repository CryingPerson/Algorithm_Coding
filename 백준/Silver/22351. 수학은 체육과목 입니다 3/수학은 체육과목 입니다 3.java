import java.io.IOException;
import java.util.*;

class Main {
    static char[][] board;

    static String[] months = { "Thursday", "Friday", "Saturday", "Sunday","Monday", "Tuesday", "Wednesday"};
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String s=  sc.nextLine();


        StringBuilder sb = new StringBuilder();

        if (s.length() < 2) {
            System.out.println(s + " " + s);
            return;
        }
        if (s.length() < 3) {
            int start = s.charAt(0) - '0';
            int enf = s.charAt(1) - '0';

            for (int i = start; i <= enf; i++) {
                sb.append(i);
            }
            if (sb.toString().equals(s)) {
                System.out.print(s.charAt(0) + " " + s.charAt(1));
            }else{
                System.out.println(s + " " + s);
            }
            return;
        }
        for (int i = 0; i < 3; i++) {
            String first = s.substring(0,i + 1);
            for (int j = s.length() - 3; j < s.length(); j++) {
                for (int k = j; k < s.length(); k++) {
                    StringBuilder sb2 = new StringBuilder();
                    String last = s.substring(k);

                    int aa = Integer.parseInt(first);
                    int bb = Integer.parseInt(last);

                    for (int a = aa; a <= bb; a++) {
                        sb2.append(a);
                    }
                    if(sb2.toString().equals(s)){
                        System.out.println(first + " " + bb);
                        return;
                    }
                }
            }
        }
        System.out.println(s + " " + s);


    }
}