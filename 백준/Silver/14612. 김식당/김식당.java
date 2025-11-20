import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        List<int[]> list = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            String cmd = sc.next();

            if (cmd.equals("order")) {
                int table = sc.nextInt();
                int time = sc.nextInt();

                list.add(new int[]{table, time});

            } else if (cmd.equals("sort")) {

                list.sort((a, b) -> {
                    if (a[1] == b[1]) return a[0] - b[0];
                    return a[1] - b[1];
                });

            } else { 
                int table = sc.nextInt();

                for (int j = 0; j < list.size(); j++) {
                    if (list.get(j)[0] == table) {
                        list.remove(j);
                        break;
                    }
                }
            }

            if (list.isEmpty()) {
                System.out.println("sleep");
            } else {
                for (int[] it : list) {
                    System.out.print(it[0] + " ");
                }
                System.out.println();
            }
        }
    }
}
