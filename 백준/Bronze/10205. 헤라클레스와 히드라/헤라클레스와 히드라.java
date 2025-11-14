import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();

        for (int i = 0; i < k; i++) {
            int head = sc.nextInt();

            String s = sc.next();
            for (char c : s.toCharArray()) {
                if(c == 'c'){
                    head++;
                }else{
                    head--;
                }
            }
            System.out.println("Data Set " + (i + 1) + ":");
            System.out.println(head);

            if(i != k - 1){
                System.out.println();
            }
        }
    }
}
