import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();

        List<sing> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] line = sc.nextLine().split(" ");
            String name = line[1];

            sing s = new sing(name);
            for (int j = 2; j < line.length; j++) {
                s.add(line[j]);
            }
            list.add(s);
        }

        for (int i = 0; i < m; i++) {
            List<String> list2 = new ArrayList<>();
            String[] line = sc.nextLine().split(" ");

            for(String lines : line) list2.add(lines);

            check(list, list2);
        }
    }

    static void check(List<sing> list, List<String> list2) {
        int cnt = 0;

        String a1 = "";

        for(String s : list2) a1 += s;

        String names = "";
        for (sing ss : list) {
            String b1 = "";
            for(int i = 0; i < 3; i++){
                b1 += ss.list.get(i);
            }
            if(b1.equals(a1)) {
                names = ss.name;
                cnt++;
            }
        }
        if(cnt == 1){
            System.out.println(names);
        }else if(cnt >= 2){
            System.out.println("?");
        }else{
            System.out.println("!");
        }
    }
}
class sing{
    String name;
    List<String> list = new ArrayList<>();

    public sing(String name){
        this.name = name;
    }

    public void add(String si) {
        list.add(si);
    }
}
