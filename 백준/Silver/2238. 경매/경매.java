import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int max = Integer.parseInt(st.nextToken()); int n = Integer.parseInt(st.nextToken());

        Map<Integer, Integer> map = new HashMap<>();

        List<info> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] lines = br.readLine().split(" ");

            String name = lines[0];
            int price = Integer.parseInt(lines[1]);


            map.put(price, map.getOrDefault(price, 0) + 1);
            list.add(new info(name, price));
        }

        int min = Integer.MAX_VALUE;
        for (int key : map.keySet()) {
            if (map.get(key) > 0 && map.get(key) < min) {
                min = map.get(key);
            }
        }

        int target = Integer.MAX_VALUE;

        for (int key : map.keySet()) {
            if (map.get(key) == min && key < target) {
                target = key;
            }
        }

        for (info ns : list) {
            if (ns.price == target) {
                System.out.println(ns.name + " " + ns.price);
                return;
            }
        }
    }
}
class info{
    String name;
    int price;

    public info(String name, int price) {
        this.name = name;
        this.price = price;
    }

}