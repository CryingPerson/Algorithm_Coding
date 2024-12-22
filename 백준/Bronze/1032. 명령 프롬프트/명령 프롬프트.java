import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] st = new String[n];
        for(int i = 0; i < n; i++){
            st[i] = br.readLine();
        }
        boolean check = true;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<st[0].length(); i++){
            char ch = st[0].charAt(i);
            for(int j = 1; j<n; j++){
                if (ch != st[j].charAt(i)) {
                    check = false;
                    break;
                } else {
                    check = true;
                }
            }
            if(check) sb.append(ch);
            else sb.append("?");
        }
        System.out.println(sb);
    }
}
