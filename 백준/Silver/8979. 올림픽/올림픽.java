import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static int n;
    static int[] ans;
    static int[][] board;
    static Set<String> list = new HashSet<>();

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        board = new int[n][m];
        List<info> list1 = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            int gold = sc.nextInt();
            int silver = sc.nextInt();
            int bronze = sc.nextInt();

            list1.add(new info(num, gold, silver, bronze));
        }

        list1.sort((o1, o2) -> {
            if(o1.gold != o2.gold) return o2.gold - o1.gold;
            if(o1.silver != o2.silver) return o2.silver - o1.silver;
            return o2.bronze - o1.bronze;
        });
        int rank = 1;

        info pre = list1.get(0);

        if(pre.num == m){
            System.out.println(1);
            return;
        }

        for(int i = 1; i < list1.size(); i++){
            info curr = list1.get(i);

            if(curr.gold != pre.gold || curr.silver != pre.silver || curr.bronze != pre.bronze){
                rank = i + 1;
            }
            if(curr.num == m){
                System.out.println(rank);
                return;
            }

            pre = curr;
        }
    }
}
class info{
    int num;
    int gold;
    int silver;
    int bronze;
    public info(int num, int gold, int silver, int bronze) {
        this.num = num;
        this.gold = gold;
        this.silver = silver;
        this.bronze = bronze;
    }
}
