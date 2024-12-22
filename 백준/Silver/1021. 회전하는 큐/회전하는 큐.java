import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        StringTokenizer str = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(str.nextToken());
        int M = Integer.parseInt(str.nextToken());
        int cnt = 0;
        LinkedList<Integer> list = new LinkedList<>();

        for(int i = 1; i<=N; i++)
        {
            list.add(i);
        }
        int[]save = new int[N];

        str = new StringTokenizer(br.readLine());
        for(int i = 0; i<M; i++)
        {
            save[i] = Integer.parseInt(str.nextToken());
        }

        for(int i =0; i<M; i++)
        {
            int target = list.indexOf(save[i]);

            int find;

            if(list.size()%2 == 0)
            {
                find = list.size()/2-1;
            }
            else
            {
                find = list.size()/2;
            }

            if(target<=find)
            {
                for(int j = 0; j<target; j++)
                {
                    list.addLast(list.pollFirst());
                    cnt++;
                }
            }
            else
            {
                for(int k = 0; k<list.size()-target; k++)
                {
                    list.addFirst(list.pollLast());
                    cnt++;
                }
            }
            list.pollFirst();
        }
        System.out.println(cnt);


    }
}