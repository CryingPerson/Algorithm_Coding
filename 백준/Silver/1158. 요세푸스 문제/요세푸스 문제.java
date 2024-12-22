import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer str = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(str.nextToken());
        int K = Integer.parseInt(str.nextToken());

        LinkedList<Integer> list = new LinkedList<>();
        sb.append("<");
        for(int i = 1; i<=N; i++)
        {
            list.add(i);
        }
        while (list.size() != 1)
        {
            for(int i = 0; i<K-1; i++)
            {
                int a = list.removeFirst();
                list.addLast(a);
            }
            sb.append(list.poll()+", ");
        }
        sb.append(list.poll()+">");
        System.out.println(sb);
    }

}
