import java.util.*;

class Main {
    static int[][] board;
    static int[][] origin;
    static List<int[]> temp;

    static int n,m,d;
    static List<int[]> removePoint;
    static int max = -1;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int m = sc.nextInt();

        // 0 1 0 1 0 0 0 1
        // 0 1 1 1 0 1 0 1
        // 1 0 0 0 1 1 0 1
        for (int i = 0; i < m; i++) {
            int sex = sc.nextInt(); int num = sc.nextInt() - 1;

            if (sex == 1) {
                for(int j = num; j < arr.length; j += (num + 1)){
                    if(arr[j] == 1){
                        arr[j] = 0;
                    }else arr[j] = 1;
                }
            }else{
                boolean[] off = new boolean[n + 1];
                int left = num - 1;
                int right = num + 1;

                off[num] = true;
                while (left >= 0 && right < n) {
                    if(arr[left] != arr[right]){
                        break;
                    }else{
                        off[left] = true;
                        off[right] = true;

                        left--;
                        right++;
                    }
                }
                for (int j = 0; j < n; j++) {
                    if(off[j]){
                        if (arr[j] == 1) {
                            arr[j] = 0;
                        }else{
                            arr[j] = 1;
                        }
                    }
                }
            }

        }
        int plus = 0;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]).append(" ");
            plus++;
            if (plus == 20) {
                sb.append("\n");
                plus = 0;
            }
        }
        System.out.println(sb);

    }
}
