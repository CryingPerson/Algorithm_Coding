import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String s2 = sc.nextLine();

        int a = s.length();
        int b = s2.length();


        int ee = a + b;
        for (int move = -b; move <= a; move++) {

            boolean ok = true;
            for (int i = 0; i < b; i++) {
                int a1 = move + i;

                if(a1 >= 0 && a1 < a){
                    if(s.charAt(a1) == '2' && s2.charAt(i) == '2'){
                        ok = false;
                        break;
                    }
                }
            }
            if(ok){
                int left = Math.min(move, 0);
                int right = Math.max(a, move + b);
                 ee = Math.min(ee, right - left);
            }
        }
        System.out.println(ee);

            // 2 1
            //12
    }
}
