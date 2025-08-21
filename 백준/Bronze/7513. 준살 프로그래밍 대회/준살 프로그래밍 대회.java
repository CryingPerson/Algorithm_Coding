import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int len = sc.nextInt();
            String[] words = new String[len];

            sc.nextLine();
            for (int j = 0; j < len; j++) {
                words[j] = sc.nextLine();
            }

            int n = sc.nextInt();


            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                List<String> list = new ArrayList<>();
                int ss = sc.nextInt();
                for (int k = 0; k < ss; k++) {
                    list.add(words[sc.nextInt()]);
                }
                for(String s : list) sb.append(s);
                sb.append("\n");
            }
            System.out.println("Scenario #" + (i+1) + ":");
            System.out.println(sb);
        }
    }
}