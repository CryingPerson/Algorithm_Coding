import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> list1 = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < 7; j++) {
                int score = sc.nextInt();
                list1.add(score);
            }
            int sum = list1.stream().filter(q -> q % 2 == 0).mapToInt(Integer::valueOf).sum();
            int asInt = list1.stream().filter(q -> q % 2 == 0).mapToInt(Integer::valueOf).min().getAsInt();
            System.out.print(sum);
            System.out.println(" " + asInt);
            list1.clear();
        }
    }
}
