import java.util.*;

public class Main {
    static int[] arr = new int[3];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int y = 0; int g = 0;

            for (int j = 0; j < 9; j++) {
                int a = sc.nextInt(); int b = sc.nextInt();
                y += a; g += b;
            }

            if(y > g){
                System.out.println("Yonsei");
            }else if(y < g) System.out.println("Korea");
            else System.out.println("Draw");
        }


    }
}
