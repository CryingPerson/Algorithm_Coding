import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++)
        {
            for(int j=0; j<i; j++)
            {
                System.out.print(' ');
            }
            for(int j = 0; j<2*(N-i)-1; j++)
            {
                System.out.print('*');
            }

            System.out.println();
        }
    }
}