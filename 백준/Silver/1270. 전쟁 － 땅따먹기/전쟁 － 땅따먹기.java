import java.util.*;

public class Main {

    static char[][] board;
    static int[] dx = {2,1,-1,-2};
    static int[] dy = {1,2,2,1};
    static Set<String> strings = new HashSet<>();
    static int max = Integer.MIN_VALUE;
    static int[] arr;
    static List<String> list = new LinkedList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            HashMap<Long, Integer> map = new HashMap<>();
            int pointedNum = -1;
            for (int j = 0; j < t; j++) {
                long num = sc.nextLong();
                map.put(num, map.getOrDefault(num, 0) +1);
            }
            long answer = 0;
            pointedNum = t/2;
            for (Map.Entry<Long, Integer> entry : map.entrySet()) {
                if(entry.getValue() > pointedNum){
                    answer = entry.getKey();
                    break;
                }
            }
            if(answer == 0){
                System.out.println("SYJKGW");
            }else{
                System.out.println(answer);
            }
        }
    }
}

