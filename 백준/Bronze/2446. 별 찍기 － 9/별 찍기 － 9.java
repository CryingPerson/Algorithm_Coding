import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++)
        {
            for(int z=0; z<i; z++)
            {
                System.out.print(' ');
            }
            for(int j = 0; j<2*(N-i)-1; j++)
            {
                System.out.print('*');
            }

            System.out.println();
        }
        for(int i=0; i<N-1; i++)
        {
            for(int z = 0; z < N-i-2; z++)
            {
                System.out.print(' ');
            }
            for(int j = 0; j<2*(i+1)+1; j++)
            {
                System.out.print('*');
            }

            System.out.println();
        }
    }
}