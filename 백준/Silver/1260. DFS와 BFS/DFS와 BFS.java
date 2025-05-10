import java.io.*;
import java.util.*;

public class Main {
    static int[][] arr;
    static int[] dx = {-1, 0, 1, 0}; // 위, 오른, 아래, 왼 (x는 행)
    static int[] dy = {0, 1, 0, -1}; // 위, 오른, 아래, 왼 (y는 열)
    static int N, targetX, targetY;
    static ArrayList<ArrayList<Integer>> list;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        list = new ArrayList<>();

        int N = sc.nextInt(); int M = sc.nextInt(); int start = sc.nextInt();
        visited = new boolean[N+1];
        for (int i = 0; i <= N; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt(); int b = sc.nextInt();
            list.get(a).add(b);
            list.get(b).add(a);
        }
        for(ArrayList<Integer> list2 : list) {
            Collections.sort(list2);
        }
        DFS(start);
        System.out.println();
        visited = new boolean[N+1];
        BFS(start);
    }
    public static void DFS(int start){
        System.out.print(start + " ");
        visited[start] = true;
        for(int num : list.get(start)){
            if(!visited[num]){
                visited[num] = true;
                DFS(num);
            }
        }
    }
    public static void BFS(int start){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;
        while (!queue.isEmpty()){
            int num = queue.size();
            for(int i = 0; i < num; i++){
                int cur = queue.poll();
                System.out.print(cur + " ");
                for(int num2 : list.get(cur)){
                    if(!visited[num2]){
                        visited[num2] = true;
                        queue.add(num2);
                    }
                }
            }
        }
    }
}
