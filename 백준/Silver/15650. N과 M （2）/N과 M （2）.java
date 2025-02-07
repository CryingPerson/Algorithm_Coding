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
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer str = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(str.nextToken());
        int m = Integer.parseInt(str.nextToken());
        ch = new int[n+1];
        int[] arr = new int[m+1];
        Solution.solution(n,m,0,1,arr,ch);
    }

}
class Solution {
    public static void solution(int n, int m, int L, int s,int []arr, int[] ch) {
        if(L == m){
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i<m; i++){
                sb.append(arr[i]);
                if(i < m-1) sb.append(" ");
            }
            System.out.println(sb);
        }else{
            for(int i = s; i<=n; i++){
                if(ch[i] == 0){
                    arr[L] = i;
                    solution(n,m,L+1,i+1,arr,ch);
                }
            }
        }
    }
}