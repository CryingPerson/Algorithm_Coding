import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            int[] arr = new int[6];
            int day = 1;
            for (int j = 0; j < 6; j++) {
                int food = sc.nextInt();
                arr[j] = food;
            }
            int total = Arrays.stream(arr).sum();
            if(total <= m){
                day++;
            }else{
                System.out.println(day);
                continue;
            }
            while (true) {
                int[] newArr = new int[6];
                int sum = 0;
                for (int k = 0; k < 6; k++) {
                    total = arr[(k + 5) % 6] + arr[(k+1) % 6] + arr[(k + 3) % 6] + arr[k];
                    sum += arr[(k + 5) % 6] + arr[(k+1) % 6] + arr[(k + 3) % 6] + arr[k];
                    newArr[k] = total;
                }
                if(sum <= m){
                    day++;
                }else{
                    break;
                }
                arr = newArr;
            }
            System.out.println(day);
        }
    }
}