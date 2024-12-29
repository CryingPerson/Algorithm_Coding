import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    static int[]arr;
    static boolean[]visit;
    static StringBuilder sb = new StringBuilder();
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer str = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(str.nextToken());
        int M = Integer.parseInt(str.nextToken());

        arr = new int[M];
        visit = new boolean[N];
        dfs(N,M,0);
        System.out.println(sb);
    }
    static void dfs(int N, int M, int depth)
    {
        if(depth == M)
        {
            for(int val : arr)
            {
                sb.append(val).append(' ');
            }
            sb.append('\n');
        }
        else
        {
            for(int i =0; i<N; i++)
            {
                if(!visit[i])
                {
                    visit[i] = true;
                    arr[depth] = i + 1;
                    dfs(N,M,depth + 1);
                    visit[i] = false;
                }
            }
        }
    }

}