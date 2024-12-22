import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer str = new StringTokenizer(br.readLine());
        int[]arr = new int[N];
        int findnum = arr.length;
        if(N==1)
        {
            int a = Integer.parseInt(str.nextToken());
            System.out.println(a*a);
        }
        else {
            for (int i = 0; i <N; i++) {
                int a = Integer.parseInt(str.nextToken());
                arr[i] = a;
            }
            Arrays.sort(arr);
            System.out.println(arr[0]*arr[findnum-1]);
        }
    }
}