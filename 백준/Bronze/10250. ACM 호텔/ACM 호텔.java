import java.util.*;

public class Main {
    static int N, M;
    static int[][] map;
    static List<int[]> emptyList = new ArrayList<>();
    static List<int[]> virusList = new ArrayList<>();
    static int maxSafeArea = 0;
    static int[] dx = {-1, 1, 0, 0}; // 상하좌우 이동
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            int x = sc.nextInt();

            int height = 0;
            if(x % h == 0){
                height = h;
            }else{
                height = x % h;
            }
            int width = x / h + 1;
            if(x % h == 0){
                width = x / h;
            }
            String result = "";
            if(width  < 10){
                result = height + "0" + width;
            }else{
                result = height + String.valueOf(width);
            }
            System.out.println(Integer.parseInt(result));
        }
    }
}
