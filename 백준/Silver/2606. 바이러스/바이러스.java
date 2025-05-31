import java.util.*;

public class Main {
    static int max = 0;
    static boolean[] check;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        check = new boolean[N+1];
        int m = sc.nextInt();
        for (int i = 0; i <= N; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            list.get(a).add(b);
            list.get(b).add(a);
        }

        DFS(list, 1);
        System.out.println(max);
    }
    public static void DFS(ArrayList<ArrayList<Integer>> list, int start) {
        check[start] = true;
        for(int num : list.get(start)) {
            if(!check[num]){
                check[num] = true;
                max++;
                DFS(list, num);
            }
        }
    }
}
