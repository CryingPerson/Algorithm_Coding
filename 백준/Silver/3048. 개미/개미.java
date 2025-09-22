import java.util.*;

class Main {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static boolean[][] snake;
    static int[][] board;
    static char[][] star;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N1 = sc.nextInt();
        int N2 = sc.nextInt();

        sc.nextLine();
        char[] ants = new char[N1 + N2];

        List<info> list = new ArrayList<>();
        String a = sc.nextLine();
        int idx = 0;
        for (int i = a.length() - 1; i >= 0; i--) {
            list.add(new info(a.charAt(i), 1));
        }
        int aDir = 1;
        int bDir = -1;
        String b = sc.nextLine();

        for (int i = 0; i < b.length(); i++) {
            list.add(new info(b.charAt(i), -1));
        }
        int T = sc.nextInt();

        if (T == 0) {
            for (info name : list) {
                System.out.print(name.name);
            }
            return;
        }
        // a l j c r u o
        // a l c j r u o

        // A B C D
        // A C B D
        // C A D B
        //

        // C B A D E F
        // C B D A E F
        // C D B E A F
        while (T > 0) {
            int k = 0;
            for (int j = 0; j < list.size() - 1; j++) {
                if (list.get(j).dir == 1 && list.get(j + 1).dir == -1) {
                    info temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                    j++;
                }
            }


            T--;
        }
        for (info name : list) {
            System.out.print(name.name);
        }
    }
}

class info {
    char name;
    int dir;

    public info(char name, int dir) {
        this.name = name;
        this.dir = dir;
    }
}