import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int L = sc.nextInt();


        int idx = 1;
        List<Integer> list = new ArrayList<>();
        while (list.size() < n) {
            if(!String.valueOf(idx).contains(String.valueOf(L))) {
                list.add(idx);
            }
            idx++;
        }
        System.out.println(list.get(list.size() - 1));
    }
}
