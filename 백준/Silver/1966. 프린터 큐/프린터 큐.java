import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int ans = 0;
            PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

            StringTokenizer str = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(str.nextToken());
            int[] arr = new int[n];
            int location = Integer.parseInt(str.nextToken());
            StringTokenizer str1 = new StringTokenizer(br.readLine());

            for (int j = 0; j < n; j++) {
                int a = Integer.parseInt(str1.nextToken());
                queue.offer(a);
                arr[j] = a;
            }
            while (!queue.isEmpty()) {
                for (int k = 0; k < n; k++) {
                    if (!queue.isEmpty() && queue.peek() == arr[k]) {
                        queue.poll();
                        ans++;

                        if (location == k) {
                            System.out.println(ans);
                            queue.clear();
                            break;
                        }
                    }
                }
            }

        }

    }
}