import java.util.*;

public class Main {
    static int a1 = 0;
    static int b1 = 0;
    static boolean active = true;
    static int[] dx = {0, -1, -1, -1, 0, 1, 1, 1};
    static int[] dy = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] cx = {-1, -1, 1, 1};
    static int[] cy = {-1, 1, 1, -1};
    static boolean[] visited;
    static int cnt = 0;
    static int dir;
    static int x;
    static int y;
    static boolean[][] cloud;

    public static int roomMax;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int playerNum = sc.nextInt();
        roomMax = sc.nextInt();

        sc.nextLine();
        List<info> list = new ArrayList<>();
        int idx = 0;
        for (int i = 0; i < playerNum; i++) {
            String[] person = sc.nextLine().split(" ");
            int num = Integer.parseInt(person[0]);
            String name = person[1];

            person p = new person(name, num);
            boolean join = false;

            if (list.isEmpty()) {
                info ifs = new info(num, name, roomMax);
                ifs.add(p);
                list.add(ifs);
            } else {
                for (info li : list) {
                    if (li.check() && li.enter(num)) {
                        li.add(p);
                        join = true;
                        break;
                    }
                }
                if (!join) {
                    info ifs = new info(num, name, roomMax);
                    ifs.add(p);
                    list.add(ifs);
                }
            }
        }

        for (info ii : list) {
            if (ii.isStated()) {
                ii.print();
            } else {
                ii.print2();
            }
        }
    }
}

class info {
    int num;
    String name;
    List<person> list = new ArrayList<>();

    int max;

    public info(int num, String name, int max) {
        this.num = num;
        this.name = name;
        this.max = max;
    }

    public void print2() {
        System.out.println("Waiting!");
        list.sort(((o1, o2) -> {
            return o1.name.compareTo(o2.name);
        }));
        for (person p : list) {
            System.out.print(p.level + " " + p.name);
            System.out.println();
        }
    }

    public void print() {
        System.out.println("Started!");
        list.sort(((o1, o2) -> {
            return o1.name.compareTo(o2.name);
        }));
        for (person p : list) {
            System.out.print(p.level + " " + p.name);
            System.out.println();
        }
    }

    public boolean isStated() {
        if (list.size() == max) return true;
        return false;
    }

    public void add(person person) {
        list.add(person);
    }

    public boolean enter(int newNum) {
        if (num - 10 <= newNum && newNum <= num + 10) return true;
        return false;
    }

    public boolean check() {
        if (list.size() < max) {
            return true;
        }
        return false;
    }
}

class person {
    String name;
    int level;

    public person(String name, int level) {
        this.name = name;
        this.level = level;
    }
}
