import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int col = sc.nextInt();
        int row = sc.nextInt();

        int maxH = 0;
        int maxL = 0;
        int N = sc.nextInt();
        List<Integer> list = new LinkedList<>();
        List<Integer> list2 = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a == 0) list.add(b);
            if(a == 1) list2.add(b);

        }
        list.add(0);
        list.add(row);
        list2.add(0);
        list2.add(col);

        Collections.sort(list);
        Collections.sort(list2);

        for (int i = 0; i < list.size() - 1; i++) {
            maxL = Math.max(maxL, list.get(i + 1) - list.get(i));
        }
        for (int i = 0; i < list2.size() - 1; i++) {
            maxH = Math.max(maxH, list2.get(i + 1) - list2.get(i));
        }
        System.out.println(maxH * maxL);
    }
}
