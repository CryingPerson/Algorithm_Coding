import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int num = 1;
        int a = 1;
        while (true) {
            if(n < num && a == 1){
                System.out.println(num - n);
                break;
            }else if(n < num && a == 2){
                System.out.println(0);
                break;
            }
            n -= num;
            a = (a == 1) ? 2 : 1;
            num++;
        }
    }
}
