import java.util.*;

class Main {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static char[][] game;
    static List<int[]> dis = new ArrayList();
    static int goalX;
    static int goalY;
    static int cnt = 0;
    static int dir = 0;

    static boolean[][] visited;
    static boolean[] tr;
    static List<ArrayList<Integer>> list = new ArrayList<>();
    static char[][] board;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        String[] arr = new String[n];

        Arrays.fill(arr, "?");
        sc.nextLine();
        int cur = 0;
        Set<String> set = new HashSet<>();
        for (int i = 0; i < k; i++) {
            String[] lines = sc.nextLine().split(" ");

            int count = Integer.parseInt(lines[0]);
            String num = lines[1];

            int push = ((cur - count) % n + n) % n;
            if (arr[push].equals("?")) {
                if (set.contains(num)) {
                    System.out.println("!");
                    return;
                }
                arr[push] = num;
                set.add(num);
            } else if (!arr[push].equals(num)) {
                System.out.println("!");
                return;
            }


            cur = push;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[(cur + i) % n]);
        }
    }
}