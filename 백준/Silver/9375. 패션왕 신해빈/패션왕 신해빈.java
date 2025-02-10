

import java.util.*;

class Main {
    static int[] dx = {-1, 0, 1, 0}; //
    static  ArrayList<ArrayList<Integer>> list;
    static int[] dy = {0, 1, 0, -1};
    static int[] ch;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            HashMap<String, Integer> map = new HashMap<>();
            for (int j = 0; j < m; j++) {
                String a = sc.next();
                String b = sc.next();
                map.put(b, map.getOrDefault(b, 0) + 1);
            }
            int sum = 1;
            for(int x : map.values()){
                sum *= x +1;
            }
            System.out.println(sum-1);
        }
    }
}
