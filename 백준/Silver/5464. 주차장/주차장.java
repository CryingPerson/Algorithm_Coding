import java.io.IOException;
import java.util.*;

class Main {
    static char[][] board;

    static String[] months = {"Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday"};

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); int m = sc.nextInt();

        List<info> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int carN = sc.nextInt();
            list.add(new info(carN, false));
        }

        List<car> list2 = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            list2.add(new car(sc.nextInt()));
        }

        int total = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < 2 * m; i++) {
            int num = sc.nextInt();

            if (num < 0) {
                num = Math.abs(num);
                int idx = list2.get(num - 1).idx;
                list.get(idx).pakred = false;
                list2.get(num - 1).idx = -1;

                if (!queue.isEmpty()) {
                    int nextCar = queue.poll();
                    for (int j = 0; j < n; j++) {
                        if (!list.get(j).pakred) {
                            total += list.get(j).carNum * list2.get(nextCar).wegih;
                            list2.get(nextCar).idx = j;
                            list.get(j).pakred = true;
                            break;
                        }
                    }
                }
            }else{
                int pos = 0;
                boolean ok = false;
                for (info in : list) {
                    if (list2.get(num - 1).idx == -1 && !in.pakred) {
                        total += list.get(pos).carNum * list2.get(num - 1).wegih;
                        list2.get(num - 1).idx = pos;
                        in.pakred = true;
                        ok = true;
                        break;
                    }
                    pos++;
                }
                if (!ok) {
                    queue.add(num - 1);
                }
            }
        }
        System.out.println(total);
    }
}
class car{
    int wegih;
    int idx;

    public car(int wegih) {
        this.wegih = wegih;
        this.idx = -1;
    }
}
class info{
    int carNum;
    boolean pakred;

    public info(int carNum, boolean pakred) {
        this.carNum =carNum;
        this.pakred = pakred;
    }
}