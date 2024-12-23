import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Map<String, Integer> map = new HashMap<>();

        StringTokenizer str = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(str.nextToken());
        int M = Integer.parseInt(str.nextToken());
        String[]arr = new String[N+1];

        for(int i=1; i<=N; i++)
        {
            arr[i] =br.readLine();
            map.put(arr[i],i);
        }
        for(int i=0; i<M; i++)
        {
            String s = br.readLine();
            if(map.containsKey(s))
            {
                System.out.println(map.get(s));
            }
            else
            {
                int find = Integer.parseInt(s);
                System.out.println(arr[find]);
            }
        }
    }
}