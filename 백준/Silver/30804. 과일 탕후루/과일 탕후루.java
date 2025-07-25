import java.util.*;

public class Main {
    static int[][] arr;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0 ,-1};
    static int count = 0;
    static int check= 0;
    static boolean flag = true;
    static int x,y;
    static int repairX, repairY;
    static boolean[][] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int nun = sc.nextInt();
            arr[i] = nun;
        }

        int left = 0; int maxLen = 0;
        for (int right = 0; right < n; right++) {
            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);

            while (map.size() > 2){
                map.put(arr[left], map.get(arr[left]) -1);
                if(map.get(arr[left]) == 0){
                    map.remove(arr[left]);
                }
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        System.out.println(maxLen);
    }

}
