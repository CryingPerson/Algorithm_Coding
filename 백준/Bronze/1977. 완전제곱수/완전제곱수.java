import java.io.IOException;
import java.util.*;

public class Main {
    static int[] ch;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = (int) Math.ceil(Math.sqrt(n)); i <= (int) Math.sqrt(m); i++) {
            int square = i * i;
            if (square >= n && square <= m) {
                list.add(square);
            }
        }
        if(list.isEmpty()) {
            System.out.println(-1);
            return;
        }
        int sum = list.stream().mapToInt(i -> i).sum();
        int min = list.stream().mapToInt(i -> i).min().getAsInt();

        System.out.println(sum);
        System.out.println(min);


    }
}