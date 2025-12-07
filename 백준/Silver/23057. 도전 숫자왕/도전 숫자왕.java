import java.util.*;

class Main {
    static char[][] board;
    static int[][] origin;
    static List<int[]> temp;

    static int n, m, d;
    static List<int[]> removePoint;
    static int max = -1;

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static boolean[][] visited;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        Set<Integer> set = new HashSet<>();
        for(int xx : arr) set.add(xx);

        combina(set, arr, 0,  new LinkedList<>());

        int ans = sum - set.size();

        System.out.println(ans);


    }

    static void combina(Set<Integer> set, int[] arr, int start, List<Integer> list) {

        int sum = 0;
        for (int num : list) sum += num;
        if(sum != 0)
        set.add(sum);

        for (int i = start; i < arr.length; i++) {
            list.add(arr[i]);
            combina(set, arr, i + 1, list);
            list.remove(list.size() - 1);
        }
    }
}