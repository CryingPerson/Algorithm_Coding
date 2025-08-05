import java.util.*;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static int[] arr = new int[3];
    static char[][] board;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++) map.put(sc.nextInt(), 1);

        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            if(map.containsKey(sc.nextInt())){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }
    }
}