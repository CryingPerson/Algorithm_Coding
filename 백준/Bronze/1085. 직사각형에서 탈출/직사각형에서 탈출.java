import java.awt.List;
import java.io.*;
import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str=new StringTokenizer(br.readLine());

        int x=Integer.parseInt(str.nextToken());
        int y=Integer.parseInt(str.nextToken());
        int w=Integer.parseInt(str.nextToken());
        int h=Integer.parseInt(str.nextToken());

        int Shortcm=Math.min(w-x,x-0);
        int Sohrtym=Math.min(h-y,y-0);
        int Finalshort=Math.min(Shortcm,Sohrtym);
        System.out.println(Finalshort);
    }
}