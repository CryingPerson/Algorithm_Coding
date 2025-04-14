import java.util.*;

public class Main {
    static int[][] board;

    public static int[] dx = {-2, -2, 0, 0, 2, 2};
    public static int[] dy = {-1, 1, -2, 2, -1, 1};
    public static int r1;
    public static int c1;
    public static int r2;
    public static int c2;
    public static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
        List<Integer> list2 = List.of();
        for (int i = 0; i < N; i++) {
            String s = sc.next();
            if (s.equals("all") || s.equals("empty")) {
                if(s.equals("all")){
                    list.clear();
                    list.addAll(list1);
                }else{
                    list.clear();
                    list.addAll(list2);
                }
            } else if (s.equals("add")) {
                int s2 = sc.nextInt();
                if (list.contains(s2)) continue;
                list.add(s2);
            } else if (s.equals("check")) {
                int s2 = sc.nextInt();
                if (list.contains(s2)) {
                    sb.append(1).append("\n");
                } else sb.append(0).append("\n");
            } else if (s.equals("remove")) {
                int s2 = sc.nextInt();
                if (!list.contains(s2)) continue;
                list.remove(Integer.valueOf(s2));
            } else if (s.equals("toggle")) {
                int s2 = sc.nextInt();
                if (list.contains(s2)) list.remove(Integer.valueOf(s2));
                else list.add(s2);
            }

        }
        System.out.println(sb);
    }
}