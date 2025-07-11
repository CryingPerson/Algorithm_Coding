import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s=  sc.nextLine();
        String find;
        if (s.length() == 1) {
            find = "0"+ s;
        }else{
            find = s;
        }
        int cnt = 0;

        while (true) {
            if(s.equals("0")){
                System.out.println(1);
                return;
            }
            if(s.length() == 1){
                int ss = Integer.parseInt(s);
                s = String.format("%02d", ss);
            }
            int b= Integer.parseInt(s.substring(0,1));
            int a = Integer.parseInt(s.substring(1));

            int ee = a + b;
            String e = String.valueOf(ee);
            if (e.length() == 1) {
                int sa = Integer.parseInt(e);
                e = String.format("%02d", sa);
            }
            s = String.valueOf(a) + e.substring(1);

            cnt++;
            if (s.equals(find)) {
                System.out.println(cnt);
                return;
            }
        }
    }
}
