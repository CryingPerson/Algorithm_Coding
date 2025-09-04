import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); int m = sc.nextInt(); int t = sc.nextInt();

        int save = -1;
        int min = Math.min(n,m);
        int max = Math.max(n,m);
        int total = 0;

        List<info> list = new ArrayList<>();
        if (t % min != 0) {
            int tota = t / min;
            int col = t % min;
            list.add(new info(tota, col));
        }
        if (t % min == 0) {
            save = Math.max(save, t / min);
            list.add(new info(save, 0));
        }else{
            int c = 0;
            while (t >= 0) {
                int cola = t % min;
                int count = c + (t / min);
                list.add(new info(count, cola));
                t -= max;
                c++;
            }

        }
        list.sort(((o1, o2) -> {
            if(o1.col == o2.col){
                return o2.count - o1.count;
            }
            return o1.col - o2.col;
        }));

        System.out.println(list.get(0).count + " " + list.get(0).col);

    }
}
class info{
    int count;
    int col;

    public info(int count, int col) {
        this.count = count;
        this.col = col;
    }
}