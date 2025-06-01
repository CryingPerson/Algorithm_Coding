import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[1001];
        int maxH = 0;
        int maxL = 0;
        for(int i = 0; i < N; i++){
            int x = sc.nextInt();
            int h = sc.nextInt();

            arr[x] = h;

            if (h > maxH) {
                maxH = h;
                maxL = x;
            }

        }

        int cnt = 0;
        int maxLeft = 0;
        for(int i = 0; i < maxL; i++){
            if(maxLeft < arr[i]){
                maxLeft = arr[i];
            }
            cnt += maxLeft;
        }
        maxLeft = 0;
        for(int i = 1000; i >= maxL; i--){
            if(maxLeft < arr[i]){
                maxLeft = arr[i];
            }
            cnt += maxLeft;
        }
        System.out.println(cnt);
    }
}
