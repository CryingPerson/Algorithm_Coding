import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); 
        int findNum = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) arr[i] = sc.nextInt();

        int cnt = 0;
        int pos = 0;
        boolean[] visited = new boolean[N];

        while (!visited[pos]) {
            if (pos == findNum) {
                System.out.println(cnt);
                return;
            }

            visited[pos] = true;
            pos = arr[pos];
            cnt++;
        }

        // 방문한 적 있는 노드를 또 방문했다면 사이클
        System.out.println(-1);
    }
}
