import java.util.*;

public class Main {
    static String[][] time;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int total = 0;
        int muti = 1;
        for (int i = 1; i <= 9; i++) {
            total = 0;
            muti = 1;
            for (char c : s.toCharArray()) {
                if(c == '*'){
                    c = (char)(i + '0');
                }
                total += (c - '0') * muti;
                muti = (muti == 3) ? 1 : 3;
            }
            if(total % 10 == 0){
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }
}
