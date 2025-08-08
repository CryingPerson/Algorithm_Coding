import java.util.*;

public class Main {
    static String[][] time;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[1000001];

        for (int i = 0; i < n; i++) {
            arr[sc.nextInt()]++;
        }

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] == 0){
                System.out.println(i);
                return;
            }
        }
    }
}
