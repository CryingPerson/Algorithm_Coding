import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int personnumber = Integer.parseInt(br.readLine());

        StringTokenizer str = new StringTokenizer(br.readLine());
        int[] arr = new int[personnumber];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(str.nextToken());
        }
        int cnt = 0;
        Arrays.sort(arr);
        int[] anotherarr = new int[personnumber];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                cnt += arr[j];
            }
        }
        System.out.println(cnt);
    }
}