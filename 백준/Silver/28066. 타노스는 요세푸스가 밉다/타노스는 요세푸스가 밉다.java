import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); int k =sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        while (queue.size() > 1) {
            int first = queue.peek();

            if (queue.size() > k) {
                for (int i = 0; i < k; i++) {
                    queue.poll();
                }
            }else{
                while (!queue.isEmpty()) {
                    queue.poll();
                }
            }
            queue.add(first);
        }
        System.out.println(queue.poll());
    }
}
