import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = 0;
        for (int i = 0; i < 8; i++) {
            String s = br.readLine();
            for (int j = 0; j < 8; j++) {
                if(s.charAt(j) == 'F' && (i+j)%2 == 0)cnt++;
            }
        }
        System.out.println(cnt);
    }
}