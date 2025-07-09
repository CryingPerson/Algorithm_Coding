import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String undo = sc.nextLine();
        int n = sc.nextInt();
        sc.nextLine();
        List<String> list = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            String s = sc.nextLine();
            String check = undo + s;
            list.add(check);
        }


        int Max = Integer.MIN_VALUE;
        int aa = -1;
        List<String> list1 = new ArrayList<>();
        for(int i = 0; i < list.size(); i++) {
            String s = list.get(i);

            int L = 0;
            int O = 0;
            int V = 0;
            int E = 0;
            for(char c : s.toCharArray()) {
                c = Character.toUpperCase(c);
                if('L' == c) L++;
                else if('O' == c) O++;
                else if('V' == c) V++;
                else if('E' == c) E++;
            }
            int sum = ((L+O) * (L+V) * (L+E) * (O+V) * (O+E) * (V+E)) % 100;
            if(sum > Max) {
                list1.clear();
                list1.add(list.get(i));
                Max = sum;
            }else if(sum == Max) {
                list1.add(list.get(i));
            }
        }
        Collections.sort(list1);
        System.out.println(list1.get(0).substring(undo.length()));
    }
}

