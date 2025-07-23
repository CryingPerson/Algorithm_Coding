import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        List<int[]> poket = new ArrayList<>();
        int max = -1;
        int total = 0;
        String prioirt = "";
        for (int i = 0; i < n; i++) {
                String poketmonName = sc.nextLine();
                int require = sc.nextInt();
                int have = sc.nextInt();
                sc.nextLine();

            int i1 = revelUp(poketmonName, require, have);
            if(max < i1) {
                prioirt = poketmonName;
                max = i1;
            }
            total += i1;
        }
        System.out.println(total);
        System.out.println(prioirt);
    }

    static int revelUp(String nane, int require, int have) {
        int cnt = 0;

        int temp = have;
        while (have >= require) {
            int num = have / require;

            cnt += num;
            have = have - (num * require) + (num * 2);
        }
        return cnt;
    }

}
