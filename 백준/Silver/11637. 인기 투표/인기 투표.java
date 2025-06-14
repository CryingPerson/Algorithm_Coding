import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N1 = sc.nextInt();

        for(int i = 0; i < N1; i++) {
            int N2 = sc.nextInt();
            int max = Integer.MIN_VALUE;
            int[] arr = new int[N2];
            for(int j = 0; j < N2; j++) {
                int vote = sc.nextInt();
                arr[j] = vote;
                if(vote > max) {
                    max = vote;
                }
            }

            check(arr, max);
        }

    }
    static void check(int[] arr, int max) {
        int cnt = 0;
        int sum = Arrays.stream(arr).max().getAsInt();
        int compare = 0;
        int priority = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == max){
                cnt++;
                priority = i + 1;
            }else{
                compare += arr[i];
            }
        }

        if(cnt > 1){
            System.out.println("no winner");
            return;
        }
        if(sum > compare){
            System.out.println("majority winner " + priority);
        }else{
            System.out.println("minority winner " + priority);
        }
    }
}