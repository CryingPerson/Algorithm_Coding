import java.util.*;

public class Main {
    static String a = "";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < 20; j++) {
                list.add(sc.nextInt());
            }
            int ans = simul(list);
            System.out.print(num + " " + ans);
            System.out.println();
        }
    }

    static int simul(List<Integer> list) {
        List<Integer> temp = new ArrayList<>();

        int pos = temp.size();
        int cnt = 0;
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            pos = temp.size();
            for (int j = 0; j < temp.size(); j++) {
                int number = temp.get(j);

                if(num < number){
                    pos = j;
                    break;
                }
            }
            temp.add(pos, num);
            cnt += temp.size() - 1 - pos;
        }
        return cnt;
    }
}
