import java.util.*;

class Main {
    static int[][] board;
    static int[][] origin;
    static List<int[]> temp;
    static boolean end = true;

    static int Size = 0;
    static int n, m, d;
    static boolean[][] che;
    static List<int[]> removePoint;
    static int max = -1;

    static List<int[]> teacher;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static boolean[] visited;

    static List<int[]> start;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt(); m = sc.nextInt();


        int[] bfs = bfs();
        int[] bfs1 = bfs(bfs[0]);

        System.out.println(bfs[0]);
        System.out.println(bfs1[0]);
    }


    static int[] bfs(int nn) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(n);

        int L = 0;
        int count = 0;
        int heu = Integer.MAX_VALUE;
        visited = new boolean[100001];
        visited[n] = true;
        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int poll = queue.poll();
                visited[poll] = true;
                if(poll == m && L == nn){
                    count++;
                }
                int back = poll - 1;

                if(check(back)){
                    queue.add(back);
                }
                int front = poll + 1;
                if(check(front)){
                    queue.add(front);
                }
                int move = poll * 2;
                if(check(move)){
                    queue.add(move);
                }
            }
            L++;
        }
        return new int[]{count, 0};
    }
    static int[] bfs() {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(n);

        int L = 0;
        int count = 0;
        int heu = Integer.MAX_VALUE;
        visited = new boolean[100001];
        visited[n] = true;
        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int poll = queue.poll();
                if(poll == m){
                    heu = Math.min(L, heu);
                }
                int back = poll - 1;

                if(check(back)){
                    visited[back] = true;
                    queue.add(back);
                }
                int front = poll + 1;
                if(check(front)){
                    visited[front] = true;
                    queue.add(front);
                }
                int move = poll * 2;
                if(check(move)){
                    visited[move] = true;
                    queue.add(move);
                }
            }
            L++;
        }
        return new int[]{heu, 0};
    }

    static boolean check(int num) {
        if(num < 0 || num > 100000) return false;
        if(visited[num]) return false;
        return true;
    }
}