import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); int point = sc.nextInt(); int P = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = 1;
        int size = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > point) {
                size++;
                ans++;
            }else{
                size++;
            }
            if(size == P && arr[i] >= point){
                System.out.println(-1);
                return;
            }
        }
        System.out.println(ans);
    }
}
