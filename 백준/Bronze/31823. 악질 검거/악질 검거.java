import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); int len = sc.nextInt();

        HashSet<Integer> set = new HashSet<>();
        sc.nextLine();
        String[] st = new String[n];
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String[] split = s.split(" ");
            String first = split[0];

            st[i] = split[len];
            int cnt = 0;
            int max = 0;
            if(first.equals(".")){
                cnt = 1;
            }else cnt = 0;
            for (int j = 1; j < len; j++) {
                if(first.equals(".") && split[j].equals(".")){
                    cnt++;
                }else if(split[j].equals(".")){
                    cnt = 1;
                }else{
                    max = Math.max(max, cnt);
                    cnt = 0;
                }
                first = split[j];
            }

            max = Math.max(max, cnt);
            set.add(max);
            ans[i] = max;
        }
        System.out.println(set.size());
        for (int i = 0; i < n; i++) {
            System.out.println(ans[i] + " " + st[i]);
        }

    }
}