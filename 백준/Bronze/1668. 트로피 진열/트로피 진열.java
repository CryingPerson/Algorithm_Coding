import java.util.*;

class Main {
    static char[][] board;
    static int[] dx = {-1, 0, 1, 0}; // U R D L
    static int[] dy = {0, 1, 0, -1};
    static int[]arr;
    static boolean[] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            int i1 = sc.nextInt();
            arr[i] = i1;
            arr2[n-i-1] = i1;
        }

        int cnt = 1;
        int curHeight = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(curHeight < arr[i]){
                cnt++;
                curHeight = arr[i];
            }
        }
        System.out.println(cnt);

        int cnt2 = 1;
        int curHeight2 = arr2[0];
        for (int i = 1; i < arr2.length; i++) {
            if(curHeight2 < arr2[i]){
                cnt2++;
                curHeight2 = arr2[i];
            }
        }
        System.out.println(cnt2);
    }
}
