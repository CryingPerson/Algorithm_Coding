import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer str = new StringTokenizer(br.readLine());
        int lastnumber = 0;
        for(int i =0; i<N; i++)
        {
            int cnt = 0;
            int a = Integer.parseInt(str.nextToken());
            if(a==1 || a==0)continue;
            for(int j = 1; j<=a; j++)
            {
                if(a%j == 0)
                {
                    cnt ++;
                }
            }
            if(cnt == 2)
            {
                lastnumber++;
            }
        }
        System.out.println(lastnumber);
    }
}