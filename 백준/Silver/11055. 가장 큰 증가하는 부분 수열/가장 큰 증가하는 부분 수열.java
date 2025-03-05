import java.util.*;

class Main {
    public static int maxTemp = 0;
    public static int[] diss;

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int T = kb.nextInt();
        int[] dis = new int[T];
        diss = new int[T];

        for (int i = 0; i < T; i++) {
            dis[i] = kb.nextInt();
        }
        int lis = LIS(dis);
        System.out.println(lis);
    }

    public static int LIS(int[] dis) {
        diss[0] = dis[0];
        for (int i = 1; i < dis.length; i++) {
            int max = 0;
            for (int j = i - 1; j >= 0; j--) {
                if(dis[i] > dis[j] && max < diss[j]){
                    max = diss[j];
                }
            }
            diss[i] = max + dis[i];
        }
        return Arrays.stream(diss).max().getAsInt();
    }
}