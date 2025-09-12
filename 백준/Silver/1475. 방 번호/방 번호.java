import java.util.*;

public class Main {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] board;
    static int n;
    static int cc = 1;
    static List<List<Integer>> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int[] arr = new int[10];

        for (char ch : s.toCharArray()) {
            int num = ch - '0';

            if(num == 9 || num == 6){
                arr[9]++;
            }else arr[ch - '0']++;
        }

        int max = -1;
        for (int i = 0; i < arr.length; i++) {
            if(i == 9){
                if (arr[i] % 2 != 0) {
                    arr[i] = arr[i] / 2 + 1;
                }else{
                    arr[i] = arr[i] / 2;
                }
                if (arr[i] > max) {
                    max = arr[i];
                }
            }else{
                if(arr[i] > max){
                    max = arr[i];
                }
            }

        }
        System.out.println(max);
    }

}