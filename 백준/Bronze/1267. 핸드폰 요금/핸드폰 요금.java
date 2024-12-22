import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int ymoy = 0;
        int mmoy = 0;

        StringTokenizer str = new StringTokenizer(br.readLine());
        for(int i =0; i<N; i++)
        {
            int a = Integer.parseInt(str.nextToken());
            ymoy += (a/30 + 1) * 10;
            mmoy += (a/60 + 1) * 15;
        }
        if(ymoy == mmoy)
        {
            System.out.println("Y M "+ymoy);
        }
        else if(ymoy>mmoy)
        {
            System.out.println("M "+mmoy);
        }
        else
        {
            System.out.println("Y "+ymoy);
        }
    }

}