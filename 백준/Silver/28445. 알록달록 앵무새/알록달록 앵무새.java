import java.io.IOException;
import java.util.*;

class Main {
    static char[][] board;

    static String[] months = {"Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday"};

    static Set<String> set = new HashSet<>();
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String[] co = new String[4];
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            String[] lines = sc.nextLine().split(" ");
            String color = lines[0]; String colo2 = lines[1];
            list.add(color); list.add(colo2);
        }

        DFS(list, 0, "");
        List<String[]> list1 = new ArrayList<>();

        for (String x : set) {
            String[] ss = x.split(" ");
            list1.add(new String[]{ss[0],ss[1]});
        }
        list1.sort(((o1, o2) -> {
            if (o1[0].equals(o2[0])) {
                return o1[1].compareTo(o2[1]);
            }
            return o1[0].compareTo(o2[0]);
        }));

        for (String[] sss : list1) {
            System.out.println(sss[0] + " " + sss[1]);
        }
    }

    static void DFS(List<String> list, int L, String ss) {
        if (L == 2) {
            String trim = ss.trim();
            set.add(trim);
        }else{
            for (int i = 0; i < list.size(); i++) {
                DFS(list, L + 1, ss + list.get(i) + " ");
            }
        }
    }
}