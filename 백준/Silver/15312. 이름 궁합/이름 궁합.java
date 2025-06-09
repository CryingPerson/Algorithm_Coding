import java.util.*;

public class Main {
    static int[] dx = {1, 0, -1, 0}; // 남, 서, 북, 동
    static int[] dy = {0, -1, 0, 1};
    static int[] alpabet = {3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();

        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            char c2 = b.charAt(i);


            list.add(alpabet[c - 'A']);
            list.add(alpabet[c2 - 'A']);
        }
        while (list.size() > 2) {
            List<Integer> next = new ArrayList<>();
            for (int i = 0; i < list.size() - 1; i++) {
                next.add((list.get(i) + list.get(i + 1)) % 10);
            }
            list = next;
        }
        for (int x : list) {
            System.out.print(x);
        }
    }
}
