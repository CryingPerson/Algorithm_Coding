import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int findNum = 0;
        int cnt = 0;
        while (N != cnt) {
            findNum++;
            if (String.valueOf(findNum).contains("666")) {
                cnt++;
            }
        }
        System.out.println(findNum);
    }
}