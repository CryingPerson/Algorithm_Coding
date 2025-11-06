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

        int[] divid = {300, 60, 10};

        int[] arr = new int[3];
        int idx = 0;
        for (int x : divid) {
            arr[idx] = n / divid[idx++];
            n %= x;
        }
        if(n != 0){
            System.out.println(-1);
            return;
        }
        for(int xxx : arr) System.out.print(xxx + " ");
    }
}