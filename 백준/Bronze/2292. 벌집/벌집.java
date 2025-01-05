import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        int FirstPlace=1;
        int FindPlace=0;
        for(int i=0; i<N; i++)
        {
            FirstPlace +=6*i;
            if(FirstPlace >=N)
            {
                FindPlace +=i+1;
                break;
            }
        }
        System.out.println(FindPlace);
    }
}