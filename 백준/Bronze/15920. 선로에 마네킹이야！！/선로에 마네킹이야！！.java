import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String[] split = sc.nextLine().split("");

        boolean pull = false;
        boolean bPull = false;
        boolean flag = false;
        int pwd = 0;
        int count = 0;
        for (int i = 0; i < split.length; i++) {
            String s = split[i];
            if(s.equals("P")){
                pull = !pull;
                flag = true;
            }else{
                pwd++;
            }
            if(pwd == 2 && !flag){
                System.out.println(5);
                return;
            }
            if(pwd == 2 && !bPull){
                if(pull){
                    System.out.println(1);
                    return;
                }else {
                    System.out.println(5);
                    return;
                }
            }else if(pwd == 2 && bPull){
                count = 6;
                System.out.println(count);
                return;
            }

            if(pwd == 1 && s.equals("P")){
                bPull = true;
            }
        }

        System.out.println(count);
    }
}