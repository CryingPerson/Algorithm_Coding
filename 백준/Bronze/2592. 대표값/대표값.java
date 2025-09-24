import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[1001];

        for (int i = 0; i < 10; i++) {
            arr[sc.nextInt()]++;
        }

        int max = 0;

        int count = -1;
        int num = -1;
        for (int i = 1000; i >= 0; i--) {
            if(arr[i] != 0) max += i * arr[i];
            if (count < arr[i]) {
                count = Math.max(count, arr[i]);
                num = i;
            }
        }

        System.out.println(max / 10 + " " + num);
    }
}