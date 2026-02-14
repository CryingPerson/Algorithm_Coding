import java.util.*;

public class Main {
    static int n,m;
    static boolean[] visited;
    static List<List<Integer>> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 0;
        int b = 0;

        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();
        int a4  = sc.nextInt();
        a = a1 + a3;
        b = a2 + a4;

        if (a < b) {
            System.out.println("Hanyang Univ.");
        } else if (a > b) {
            System.out.println("Yongdap");
        }else{
            System.out.println("Either");
        }
    }
}
