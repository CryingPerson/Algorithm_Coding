import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer str;

        int N = Integer.parseInt(br.readLine());
        int[] a = new int[N];
        Integer[] b = new Integer[N];
        str = new StringTokenizer(br.readLine());
        for(int i =0; i<N; i++)
        {
            a[i] = Integer.parseInt(str.nextToken());
        }
        str = new StringTokenizer(br.readLine());
        for(int i = 0; i<N; i++)
        {
            b[i] = Integer.parseInt(str.nextToken());
        }
        System.out.println(check(a,b,N));
    }
    static int check(int[]a , Integer[]b , int number)
    {
        Arrays.sort(a);
        Arrays.sort(b, Collections.reverseOrder());
        int sum = 0;
        for(int i =0; i<number; i++)
        {
            sum += a[i] * b[i];
        }
        return sum;
    }
}