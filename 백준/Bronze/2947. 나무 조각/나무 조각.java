import java.util.Scanner;

public class Main {
    public static int x;
    static int y;
    static int dollx;
    static int dolly;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        while (arr[0] != 1 || arr[1] != 2 || arr[2] != 3 || arr[3] != 4 || arr[4] != 5) {
            for(int i = 0; i < 4; i++) {
                boolean flag = false;
                if(arr[i] > arr[i+1]){
                    flag = true;
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i + 1] = temp;
                }
                if(flag){
                    for(int x : arr) System.out.print(x + " ");
                    System.out.println();
                }
            }
        }
    }
}
