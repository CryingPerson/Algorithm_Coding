import java.util.*;

public class Main {
    static int[] dx = {-1, 0 , 1 , 0};
    static int[] dy = {0 , 1, 0, -1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a1 = sc.nextLine();
        StringBuilder sb1 = new StringBuilder(a1);
        String b1 = sc.nextLine();
        StringBuilder sb2 = new StringBuilder(b1);

        while (sb1.length() != sb2.length()) {
            if (sb1.length() > sb2.length()) {
                sb2.append(b1);
            }else{
                sb1.append(a1);
            }
        }
        if(sb1.toString().equals(sb2.toString())){
            System.out.println(1);
        }else{
            System.out.println(0);
        }

    }
}