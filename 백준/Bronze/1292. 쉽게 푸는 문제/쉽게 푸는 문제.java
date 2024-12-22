import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList<>();

        int num = 1;
        int count = 0;
        for(int i =0; i<1000; i++)
        {
            list.add(num);
            count++;
            if(num == count)
            {
                num++;
                count = 0;
            }
        }
        StringTokenizer str = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(str.nextToken());
        int M = Integer.parseInt(str.nextToken());
        int sum = 0;
        for(int i =N-1; i<=M-1; i++)
        {
            sum += list.get(i);
        }
        System.out.println(sum);
    }
}