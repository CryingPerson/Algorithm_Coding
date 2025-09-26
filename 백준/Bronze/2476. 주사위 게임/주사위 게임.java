import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static char[] Adrian = {'A', 'B', 'C'};
    static char[] Bruno = {'B', 'A', 'B', 'C'};
    static char[] Goran = {'C', 'C', 'A', 'A', 'B', 'B'};

    static int[] fibos;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int max = -1;
        for (int i = 0; i < n; i++) {
            int total = 0;
            int[] arr = new int[7];
            Set<Integer> set = new TreeSet<>(Collections.reverseOrder());
            for (int j = 0; j < 3; j++) {
                int nun = sc.nextInt();
                arr[nun]++;
                set.add(nun);
            }
            Iterator<Integer> iterator = set.iterator();
            if (set.size() == 3) {
                total += iterator.next() * 100;
            } else if (set.size() == 1) {
                total += iterator.next() * 1000 + 10000;
            }else{
                for (int k = 0; k <= 6; k++) {
                    if (arr[k] == 2) {
                        total += k * 100 + 1000;
                    }
                }
            }
            max = Math.max(max, total);
        }
        System.out.println(max);
    }
}