import java.util.*;

class Main {
    static int[][] board;
    static int x, y;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static List<int[]> temp;

    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        int max = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int num = arr[i];

            for (int j = i + 1; j < n; j++) {
                int num2 = arr[j];

                int gocha = num2 - num;

                int first = num2 - (gocha * j);


                int[] coampre = new int[n];
                coampre[0] = first;
                for (int k = 1; k < n; k++) {
                    coampre[k] = first + k * gocha;
                }

                int count = 0;
                for (int k = 0; k < n; k++) {
                    if(coampre[k] != arr[k]){
                        count++;
                    }
                }
                max = Math.min(max, count);
            }
        }
        System.out.println(max);
    }
}