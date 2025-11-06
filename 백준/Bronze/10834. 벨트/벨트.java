import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static int[]arr;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int count = 0;
        int first = sc.nextInt(); int secont = sc.nextInt(); int firstDir = sc.nextInt();

        int cur = secont;

        boolean of = firstDir == 0 ? true : false;
        for (int i = 1; i < n; i++) {
            int i1 = sc.nextInt(); int i2 = sc.nextInt(); int dir = sc.nextInt();

            if(dir == 1){
                if(of){
                    of = false;
                }else{
                    of = true;
                }
            }
            cur = (cur / i1) * i2;
        }
        if(of){
            System.out.print(0 + " ");
        }else System.out.print(1 + " ");
        System.out.println(cur);
    }
}