import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long N = Long.parseLong(br.readLine());
      
        int minus = 1;
        while (true)
        {
            if(N>=minus)
            {
                N -= minus;
            }
            else
            {
                break;
            }
            minus++;
        }
        System.out.println(minus-1);

    }
}