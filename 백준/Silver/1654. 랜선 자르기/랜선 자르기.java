import javax.xml.crypto.dsig.keyinfo.KeyInfo;
import java.util.*;

class Main {
    public static int row;
    public static char[][] board;
    public static int col;
    public static int[] arr;
    public static long maxLength = 0;
    public static int minLength = 0;
    public static int N;
    public static int[] visited;
    public static ArrayList<ArrayList<Integer>> list;

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int K = kb.nextInt();
         N = kb.nextInt();

        int maxLen = Integer.MIN_VALUE;
        arr = new int[K];
        for (int i = 0; i < K; i++) {
            int len = kb.nextInt();
            arr[i] = len;
            maxLen = Math.max(len, maxLen);
            minLength = Math.min(minLength, len);
        }
        long answer = bst(maxLen);
        System.out.println(answer);
    }
    public static long bst(int n){
        long left = 1;
        long right = n;

        while (left <= right){
            long mid = (left + right) / 2;

            long cnt = 0;
            for(int le : arr){
                cnt = cnt + le / mid;
            }
            if(cnt < N){
                right = mid - 1;
            } else{
                maxLength = Math.max(maxLength, mid);
                left = mid + 1;
            }
        }
        return maxLength;
    }
}