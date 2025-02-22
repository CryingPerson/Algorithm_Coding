import java.util.*;

class Main {
    static int[][] board = new int[11][11]; // -5 ~ 5의 범위를 0 ~ 10으로 매핑
    static int[] dx = {-1,0,1,0}; // U, D, L, R
    static int[] dy = {0,1,0,-1}; // U, D, L, R

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        HashMap<String ,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        List<String> list = new ArrayList<>(map.keySet());
        list.sort(((o1, o2) -> {
            if(map.get(o1) == map.get(o2)) {
                return o1.compareTo(o2);
            }else{
                return map.get(o2) - map.get(o1);
            }
        }));
        System.out.println(list.get(0));

    }
}