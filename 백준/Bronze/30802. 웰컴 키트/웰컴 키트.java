import java.util.Scanner;

public class Main {
    static char[][] board;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
        }
        int a = sc.nextInt(); int b = sc.nextInt();

        int sum = 0;
        for(int x : arr){
            sum += (int) Math.ceil(x/(double)a);
        }
        System.out.println(sum);
        System.out.print(n / b + " ");
        System.out.print(n % b);
    }
}
