import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class EVENT1
{
    int index;
    int value;
    EVENT1(int index, int value)
    {
        this.index = index;
        this.value = value;
    }
}
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str;
        StringBuilder sb = new StringBuilder();
        Deque<EVENT1> deque = new ArrayDeque<>();
        int N = Integer.parseInt(br.readLine());
        str = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            deque.add(new EVENT1(i,Integer.parseInt(str.nextToken())));
        }
        while (deque.size()>1)
        {
            sb.append(deque.getFirst().index+" ");
            int value = deque.poll().value;


            if(value > 0)
            {
                for(int i=0; i<value-1; i++)
                {
                    deque.addLast(deque.pollFirst());
                }

            }
            else
            {
                for(int i=0; i<Math.abs(value); i++)
                {
                    deque.addFirst(deque.pollLast());
                }

            }
        }
        sb.append(deque.poll().index);
        System.out.println(sb);

    }
}