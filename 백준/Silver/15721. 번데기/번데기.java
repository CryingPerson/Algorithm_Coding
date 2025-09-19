import java.util.*;
class Main {
    static int[] dx = {-1, 0 ,1 , 0};
    static int[] dy = {0, 1, 0, -1};
    static char[][] game;
    static List<int[]> dis = new ArrayList();
    static int goalX;
    static int goalY;
    static int cnt = 0;
    static int dir = 0;
    static boolean[][] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int T = sc.nextInt();

        int m = sc.nextInt();
        int person = 0;
        int count = 0;
        int first = 2;
        while (true) {
            int[] d = {0 , 1, 0, 1};
            for (int i = 0; i < 4; i++) {
                if(d[i] == m){
                    count++;
                    if(count == T){
                        System.out.println(person);
                        return;
                    }
                }
                person = (person + 1) % n;
            }
            for (int i = 0; i < first; i++) {
                if(m == 0){
                    count++;
                    if(count == T){
                        System.out.println(person);
                        return;
                    }
                }
                person = (person + 1) % n;
            }
            for (int i = 0; i < first; i++) {
                if (m == 1) {
                    count++;
                    if (count == T) {
                        System.out.println(person);
                        return;
                    }
                }
                person = (person + 1) % n;
            }
            first++;
        }

    }
}