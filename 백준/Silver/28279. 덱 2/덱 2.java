import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str;
        StringBuilder sb = new StringBuilder();
        Deque<Integer> deque = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());
        for(int i=0 ;i<N; i++)
        {
            str = new StringTokenizer(br.readLine());
            int First = Integer.parseInt(str.nextToken());
            if(First == 1) {
                int Two = Integer.parseInt(str.nextToken());
                deque.addFirst(Two);
            }
            else if(First == 2)
            {
                int Three = Integer.parseInt(str.nextToken());
                deque.addLast(Three);
            }
            else if(First == 3)
            {
                if(deque.isEmpty())
                {
                    sb.append(-1).append("\n");
                }
                else
                {
                    sb.append(deque.poll()).append("\n");
                }
            }

            else if(First == 4)
            {
                if(deque.isEmpty())
                {
                    sb.append(-1).append("\n");
                }
                else
                {
                    sb.append(deque.pollLast()).append("\n");
                }
            }
            else if(First == 5)
            {
                sb.append(deque.size()).append("\n");
            }
            else if(First == 6)
            {
                if(deque.isEmpty())
                {
                    sb.append(1).append("\n");
                }
                else
                {
                    sb.append(0).append("\n");
                }
            }
            else if(First == 7)
            {
                if(deque.isEmpty())
                {
                    sb.append(-1).append("\n");
                }
                else{
                    sb.append(deque.peek()).append("\n");
                }
            }
            else if(First == 8)
            {
                if(deque.isEmpty())
                {
                    sb.append(-1).append("\n");
                }
                else
                {
                    sb.append(deque.peekLast()).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}