import java.util.Scanner;

class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] cross = {5, 3, 4, 1, 2, 0};

        int[][] qube = new int[n][6];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 6; j++) {
                qube[i][j] = sc.nextInt();
            }
        }

        int max = -1;

        for (int i = 0; i < 6; i++) {
            int bottom = qube[0][i];
            int top = qube[0][cross[i]];

            int total = max(qube[0], bottom, top);

            for (int j = 1; j < n; j++) {
                int idx = find(qube[j], top);

                bottom = qube[j][idx];
                top = qube[j][cross[idx]];

                total += max(qube[j], bottom, top);
            }

            max = Math.max(total, max);
        }
        System.out.println(max);
    }

    static int find(int[] arr, int n) {
        for (int i = 0; i < 6; i++) {
            if(arr[i] == n) return i;
        }
        return -1;
    }

    static int max(int[] arr, int a, int b) {
        int max = -1;
        for (int x : arr) {
            if (a != x && b != x) {
                max = Math.max(max, x);
            }
        }
        return max;
    }
}