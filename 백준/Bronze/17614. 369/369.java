import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static char[] Adrian = {'A', 'B', 'C'};
    static char[] Bruno = {'B', 'A', 'B', 'C'};
    static char[] Goran = {'C', 'C', 'A', 'A', 'B', 'B'};

    static int[] fibos;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);



        String n = sc.nextLine();

        int[] arr = new int[10];
        int i1 = Integer.parseInt(n);
        int cou= 0;
        for (int i = 1; i <= i1; i++) {
            String s = String.valueOf(i);
            for (int j = 0; j < s.length(); j++) {
                char cc = s.charAt(j);
                if (cc == '3' || cc == '6' || cc == '9') {
                    cou++;
                }
            }
        }
        System.out.println(cou);
    }
}