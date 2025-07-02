import java.nio.IntBuffer;
import java.util.*;

public class Main {
    static int[][] ans;
    static int idx = 0;
    static int max = Integer.MAX_VALUE;
    static int x = Integer.MAX_VALUE;
    static int y = 0;
    static boolean[] check;
    static List<int[]> list3;
    static Set<String> set = new HashSet<>();
    static String[][] ch = {{"q", "w", "e", "r", "t", "y", "u", "i", "o", "p"},
            {"a", "s", "d", "f", "g", "h", "j", "k", "l", " "},
            {"z", "x", "c", "v", "b", "n", "m", " ", " ", " "}};
    static char first = 'R';


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int tema= sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = 0;
        }
        for (int i = 0; i < k; i++) {
            int a = sc.nextInt();
            arr[a-1]++;
        }
        for (int i = 0; i < tema; i++) {
            int b= sc.nextInt();
            arr[b-1] += 2;
        }


        if(arr[0] == 1){
            if(arr[1] == 2){
                arr[0] = 0;
                arr[1] = 0;
            }
        }
        if(arr[arr.length-1] == 1){
            if(arr[arr.length-2] == 2){
                arr[arr.length-1] = 0;
                arr[arr.length-2] =0;
            }
        }
        for (int i = 1; i < arr.length - 1; i++) {
            if(arr[i] == 1){
                if(arr[i-1] == 2){
                    arr[i] = 0;
                    arr[i-1] = 0;
                }else if(arr[i+1] == 2){
                    arr[i] = 0;
                    arr[i+1] = 0;
                }
            }
        }
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1) cnt++;
        }
        System.out.println(cnt);
    }
}

