import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Map<Integer, Integer> effToName = new HashMap<>();

        for (int i = 0; i < N; i++) {
            int eff = sc.nextInt();
            int name = sc.nextInt();
            effToName.put(eff, name);
        }

        int R = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < R; i++) {
            int L = sc.nextInt();
            int[] symptoms = new int[L];
            for (int j = 0; j < L; j++) {
                symptoms[j] = sc.nextInt();
            }

            boolean died = false;
            for (int s : symptoms) {
                if (!effToName.containsKey(s)) {
                    died = true;
                    break;
                }
            }

            if (died) {
                sb.append("YOU DIED\n");
            } else {
                for (int s : symptoms) {
                    sb.append(effToName.get(s)).append(' ');
                }
                sb.append('\n');
            }
        }

        System.out.print(sb);
    }
}
