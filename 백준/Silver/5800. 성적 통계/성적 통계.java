import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            List<Integer> list = new LinkedList<>();
            int total = sc.nextInt();
            for (int j = 0; j < total; j++) {
                int score = sc.nextInt();
                list.add(score);
            }
            list.sort(Collections.reverseOrder());

            check(i, list);
        }
    }
    static void check(int idx, List<Integer> list) {
        idx++;
        System.out.println("Class " + idx);
        int gap = gapCheck(list);
        System.out.println("Max " + list.get(0) + ", " + "Min "
                + list.get(list.size()-1) + ", "
        + "Largest gap " + gap);
    }

    static int gapCheck(List<Integer> list) {
        int max = -1;
        for (int i = 0; i < list.size() - 1; i++) {
            if(list.get(i) - list.get(i + 1) > max) max =
                    list.get(i ) - list.get(i + 1);
        }
        return max;
    }
}
