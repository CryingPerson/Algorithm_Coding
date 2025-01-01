import com.sun.jdi.Value;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static Deque<Integer> deque;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();

        for(int i = 1; i<=N; i++)
        {
            queue.add(i);
        }

        while (queue.size() > 1)
        {
            queue.poll();
            queue.add(queue.poll());
        }
        System.out.println(queue.poll());
    }
}