import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int C = sc.nextInt();
        int W = sc.nextInt();

        int[] trees = new int[N];

        long max = -1;
        for (int i = 0; i < N; i++) {
            int i1 = sc.nextInt();
            trees[i] = i1;
            max = Math.max(max, i1);
        }


        long maxx= -1;
        for (int i = 1; i <= max; i++) {
            long total = 0;
            for (int tree : trees) {
                int count = tree / i;

                
                int cuts = (tree % i == 0) ? count -1 : count;
                long gain = (long) count * i * W - (long) cuts * C;
                if(gain < 0) continue;
                total += gain;
            }
            maxx = Math.max(maxx, total);
        }
        System.out.println(maxx);


    }
}
