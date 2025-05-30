import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int compare = 100;
        int sum = 0;
        int max = 1000;
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i <= 10; i++) {
            int num = sc.nextInt();
            if(sum > 100){
                break;
            }
            sum += num;

            if(sum == 100) {
                System.out.println(100);
                return;
            }

            int abs = Math.abs(100 - sum);
            list.add(sum);
        }
        Collections.sort(list,Collections.reverseOrder());

        if(list.get(0) > 100){
            int a1 = Math.abs(100 - list.get(0));
            int a2 = Math.abs(100 - list.get(1));

            if(a1 < a2){
                System.out.println(list.get(0));
            }else if(a1 == a2){
                System.out.println(list.get(0));
            }else {
                System.out.println(list.get(1));
            }
        }else{
            System.out.println(list.get(0));
        }

    }
}
