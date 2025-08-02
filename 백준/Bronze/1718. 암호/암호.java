import javax.crypto.spec.PSource;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static int mmii = Integer.MAX_VALUE;
    static List<int[]> answer;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int len = s2.length();
        char[] ch1 = s1.toCharArray();

        char[]ch2 = new char[ch1.length];

        for(int i = 0; i < ch2.length; i++) ch2[i] = s2.charAt((i+len) % len);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) == ' ') {
                sb.append(' ');
                continue;
            }

            if(ch1[i] - ch2[i] < 0){
                sb.append((char) ('a' + (ch1[i] - ch2[i] + 25)));
            }else if(ch1[i] - ch2[i] == 0){
                sb.append('z');
            }
            else{
                sb.append((char) ('a' + (ch1[i] - 1 - ch2[i])));
            }
        }

        System.out.println(sb);
    }
}