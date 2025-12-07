import java.util.*;

class Main {
    static char[][] board;
    static int[][] origin;
    static List<int[]> temp;

    static int n,m,d;
    static List<int[]> removePoint;
    static int max = -1;

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static boolean[][] visited;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        // 홀수 청팀 짝수 백팀
        // 학급당 M 까지 선착순 참여 가능

        int n = sc.nextInt(); int m = sc.nextInt();


        List<info> list = new LinkedList<>();
        while (true) {
            int grade = sc.nextInt(); String name = sc.next();

            if(grade == 0 && Integer.parseInt(name) == 0) break;

            boolean plus = true;
            boolean nothing = true;
            if (!list.isEmpty()) {
                for (info ins : list) {
                    if (ins.grade == grade) {
                        nothing = false;
                        if (ins.check(grade, name)) {
                            plus = false;
                        }
                    }
                }
            }
            if(nothing) list.add(new info(grade, name, m));
        }
        List<info> blue = new LinkedList<>();

        List<info> white = new LinkedList<>();
        for (info i : list) {
            if(i.grade % 2 != 0){
                blue.add(i);
            }else white.add(i);
        }

        blue.sort(((o1, o2) -> {
            return o1.grade - o2.grade;
        }));
        for (info whs : blue) {
            whs.list.sort(((o1, o2) -> {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                }
                return o1.length() - o2.length();
            }));
            for (int i = 0; i < whs.list.size(); i++) {
                System.out.println(whs.grade + " " + whs.list.get(i));
            }
        }
        white.sort((Comparator.comparingInt(o -> o.grade)));

        for (info whs : white) {
            whs.list.sort(((o1, o2) -> {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                }
                return o1.length() - o2.length();
            }));
            for (int i = 0; i < whs.list.size(); i++) {
                System.out.println(whs.grade + " " + whs.list.get(i));
            }
        }
    }
}
class info{
    int grade;
    String name;
    int maxSize;
    List<String> list = new LinkedList<>();

    public info(int garde, String name, int maxSize){
        this.grade = garde;
        this.maxSize = maxSize;
        this.name = name;
        list.add(name);
    }

    public boolean check(int grade, String name) {
        if(list.size() < maxSize){
            list.add(name);
            return true;
        }
        return false;
    }

}
