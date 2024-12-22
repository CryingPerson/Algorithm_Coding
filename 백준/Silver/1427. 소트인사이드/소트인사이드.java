import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        char[]arr = new char[101];
        String s = br.readLine();

        for(int i=0; i< s.length(); i++)
        {
            arr[s.charAt(i)-'0']++;
        }
        for(int i=100; i>=0; i--)
        {
            while (arr[i] > 0)
            {
                System.out.print(i);
                arr[i]--;
            }
        }
    }
}