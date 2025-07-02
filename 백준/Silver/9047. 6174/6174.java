import java.nio.IntBuffer;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            int a = reser(s);
            System.out.println(a);
        }
    }

    static int reser(String s) {
        String ss = "6174";
        if (s.equals("1111") || s.equals("2222") || s.equals("3333") ||
        s.equals("4444") || s.equals("5555") || s.equals("6666") ||
        s.equals("7777") || s.equals("8888") || s.equals("9999")){
            return 0;
        }
        int cnt = 0;
        if (s.equals(ss)) {
            return cnt;
        } else {
            while (!s.equals(ss)) {
                String[] ch = s.split("");
                Arrays.sort(ch, (o1, o2) -> {
                    return (String.valueOf(o2) + String.valueOf(o1)).compareTo(String.valueOf(o1) + String.valueOf(o2));
                });
                StringBuilder a1 = new StringBuilder();
                for (String wo : ch) {
                    a1.append(wo);
                }
                int as = Integer.parseInt(a1.toString());
                Arrays.sort(ch, (o1, o2) -> {
                    return (String.valueOf(o1) + String.valueOf(o2)).compareTo(String.valueOf(o2) + String.valueOf(o1));
                });
                StringBuilder a2 = new StringBuilder();
                for (String so : ch) {
                    a2.append(so);
                }
                int ab = Integer.parseInt(a2.toString());
                String s2 = String.valueOf(as - ab);
                s = String.format("%04d", Integer.parseInt(s2));
                cnt++;
                if(s.equals("0")){
                    break;
                }
            }
        }
        return cnt;
    }
}

