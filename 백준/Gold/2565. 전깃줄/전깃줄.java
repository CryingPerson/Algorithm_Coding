import java.util.*;

class Main {
    static int[] dy;

    public int solution(int n, int[][] arr) {
        Arrays.sort(arr, (Comparator.comparingInt(o -> o[0])));

        dy = new int[n];
        dy[0] = 1;

        int maxLength = -1;
        for (int i = 1; i < n; i++) {
            int max = 0;
            for (int j = i - 1; j >= 0; j--) {
                if(arr[j][1] < arr[i][1] && max < dy[j]){
                    max = dy[j];
                }
            }
            dy[i] = max + 1;
            maxLength = Math.max(maxLength,dy[i]);
        }
        return n - maxLength;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[][] arr = new int[n][2];


        for (int i = 0; i < n; i++) {
            arr[i][0] = kb.nextInt();
            arr[i][1] = kb.nextInt();
        }

        System.out.print(T.solution(n, arr));
    }
}
