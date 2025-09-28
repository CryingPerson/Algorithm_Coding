import java.io.IOException;
import java.util.*;

class Main {
    static char[][] board;

    static String[] months = { "Thursday", "Friday", "Saturday", "Sunday","Monday", "Tuesday", "Wednesday"};
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int solve = sc.nextInt(); int panal = sc.nextInt();
            list.add(new int[]{solve, panal});
        }

        list.sort(((o1, o2) -> {
            if(o1[0] == o2[0]){
                return o2[1] - o1[1];
            }
            return o2[0] - o1[0];
        }));

        int cnt = 0;
        int[] ints = list.get(4);

        for (int i = 5; i < list.size(); i++) {
            if(ints[0] == list.get(i)[0]) cnt++;
        }
        System.out.println(cnt);

    }
}