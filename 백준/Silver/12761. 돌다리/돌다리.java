import java.util.*;
class Main {
    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt(); int B = sc.nextInt(); int n = sc.nextInt(); int m = sc.nextInt();

        int bfs = bfs(A, B, n, m);
        System.out.println(bfs);
    }
    static int bfs(int Ap, int Bp, int n, int m) {
        Queue<Integer> queue = new LinkedList<>();

        boolean[]visited = new boolean[100001];

        visited[n] = true;
        queue.add(n);

        int L = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int place = queue.poll();

                if(place == m) return L;
                int ax = place - 1;
                int bx = place + 1;

                if(check(queue,ax, visited)){
                    queue.add(ax);
                }
                if(check(queue,bx, visited)){
                    queue.add(bx);
                }

                int aax = place + Ap;
                int bbx = place + Bp;

                if(check(queue,aax, visited)){
                    queue.add(aax);
                }
                if(check(queue, bbx, visited)){
                    queue.add(bbx);
                }

                int aax1 = place - Ap;
                int bbx1 = place - Bp;

                if(check(queue,aax1, visited)){
                    queue.add(aax1);
                }
                if(check(queue, bbx1, visited)){
                    queue.add(bbx1);
                }

                int aax2 = place * Ap;
                int bbx2 = place * Bp;

                if(check(queue,aax2, visited)){
                    queue.add(aax2);
                }
                if(check(queue, bbx2, visited)){
                    queue.add(bbx2);
                }
            }
            L++;
        }
        return -1;
    }

    static boolean check(Queue<Integer> q,int num, boolean[] vi) {
        if(num < 0 || num > 100000 || vi[num]) return false;

        vi[num] = true;

        return true;
    }
}