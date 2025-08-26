import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int min = Integer.MAX_VALUE;
        int find = 0;
        for (int i = 0; i < n; i++) {
            int death = sc.nextInt();
            int m = sc.nextInt();

            int r = (death - 1) % (m + 1);

            int count = 1;
            int total = r;
            while (death - 1 > total) {
                count += 2;
                total += (m + 1);
            }
            count++;
            if(min > count){
                min = count;
                find = i+1;
            }
        }
        System.out.println(find + " " + min);
    }
}