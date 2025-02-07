import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
class node{
    int x;
    int y;
    public node(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class Main {
    static int[] ch;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer str = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(str.nextToken());
        int m = Integer.parseInt(str.nextToken());
        ch = new int[n+1];
        int[] arr = new int[m+1];
        solution(n,m,0,arr,ch);
        System.out.println(sb);
    }
    public static void solution(int n, int m, int L, int []arr, int[] ch) {
        if(L == m){
            for (int i = 0; i < m; i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
        }else{
            for(int i = 1; i<=n; i++){
                arr[L] = i;
                solution(n,m,L+1,arr,ch);
            }
        }
    }

}