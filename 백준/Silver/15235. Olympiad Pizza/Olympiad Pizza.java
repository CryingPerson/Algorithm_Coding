import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.add(new int[]{sc.nextInt(), i});
        }

        int[] answer = new int[n];

        int require = 0;
        while (!queue.isEmpty()) {
            int[] info = queue.poll();

            int cur = info[0];
            int idx = info[1];

            cur--;
            require++;

            if(cur == 0){
                answer[idx] = require;
            }else{
                queue.add(new int[]{cur, idx, require});
            }
        }
        for(int x : answer) System.out.print(x + " ");
    }
}


