import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        Arrays.sort(arr);

        int score = 0;

        int first = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[i - 1] + 1){
                score += first;
                first = arr[i];
            }
        }
        score += first;

        System.out.println(score);
    }
}
