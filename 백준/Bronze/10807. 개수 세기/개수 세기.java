import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    int[] arr = new int[50000000];
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        int[]arr=new int[n];
        int count=0;
        int n2=Integer.parseInt(br.readLine());
       for(int i=0; i<n; i++)
       {
           
           if(n2 == Integer.parseInt(st.nextToken()))
           {
               count++;
           }
       }
        System.out.println(count);
    }
}