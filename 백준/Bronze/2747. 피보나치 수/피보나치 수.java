import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static int[] store = new int[50];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(fibo(n));
    }

    public static int fibo(int n) {
        if(n == 1) return 1;
        if(n == 0) return 0;

        if(store[n] != 0) return store[n];
        return store[n] = fibo(n - 2) + fibo(n - 1);
    }
}