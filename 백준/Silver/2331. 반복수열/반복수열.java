import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int p = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(n , 1);
        int find = n;
        int ans = 0;
        for (int i = 0; i < 10000; i++) {

            find = getNext(find, p);
            map.put(find, map.getOrDefault(find, 0) + 1);
        }
        for (int val : map.values()) {
            if(val == 1) ans++;
        }
        System.out.println(ans);
    }
    public static int getNext(int num, int p){
        int re = 0;
        while (num > 0){
            int dight = num % 10;
            re += (int) Math.pow(dight, p);
            num /= 10;
        }
        return re;
    }
}
