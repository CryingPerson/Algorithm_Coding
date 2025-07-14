import java.util.*;

public class Main {
    static char[][] DNA = {{'A', 'C', 'A', 'G'}, {'C', 'G', 'T', 'A'},
            {'A', 'T', 'C', 'G'}, {'G', 'A', 'G', 'T'}};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idx = 1;
        int aa = 1;
        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;
            sc.nextLine();
            List<info> list = new LinkedList<>();
            String[] name2 = new String[n];

            List<another> temp = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                String name = sc.next();
                name2[i] = name;
                List<String> serach = new LinkedList<>();
                for (int j = 0; j < n - 1; j++) {
                    String word = sc.next();
                    serach.add(word);
                }
                list.add(new info(name, serach, i));
            }
            simulation(n, list, temp);
            System.out.println("Group " + idx);
            if (temp.isEmpty()) {
                System.out.println("Nobody was nasty");
            } else {
                for (another ss : temp) {
                    System.out.print(name2[ss.reader] + " " + "was nasty about " + name2[ss.wirter]);
                    System.out.println();
                }
            }
            list.clear();
            System.out.println();
            idx++;
            temp.clear();
        }
    }

    static void simulation(int n, List<info> list, List<another> temp) {
        int idx = 0;
        int k = 0;
        int save = 0;
        for (info im : list) {
            String name = im.name;
            int iddxx = im.idx;
            for (String s : im.save) {
                if (s.equals("N")) {
                    k = (iddxx - idx - 1 + n) % n;
                    temp.add(new another(iddxx, k));
                }
                idx++;
            }
            idx = 0;
        }

    }
}

class another {
    int wirter;
    int reader;

    public another(int wirter, int reader) {
        this.wirter = wirter;
        this.reader = reader;
    }
}

class info {
    String name;
    List<String> save;
    int idx;

    public info(String name, List<String> list, int indx) {
        this.name = name;
        this.save = list;
        this.idx = indx;
    }
}
