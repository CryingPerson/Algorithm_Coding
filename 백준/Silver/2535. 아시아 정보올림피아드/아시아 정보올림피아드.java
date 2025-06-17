import java.util.*;

public class Main {
    static int[] dx = {0, 1}; // 오른쪽, 아래
    static int[] dy = {1, 0};
    static int[][] board;
    static boolean[][] checked;
    static int xx;
    static int yy;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        List<person> list = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            list.add(new person(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        }
        list.sort((a,b) ->{
            return b.point - a.point;
        });
        HashMap<Integer, Integer> map = new HashMap<>();

        int cnt = 0;
        for (person word : list) {
            int chanck = map.getOrDefault(word.nation, 0);

            if(chanck < 2){
                map.put(word.nation, chanck+1);
                System.out.print(word.nation + " " + word.number);
                System.out.println();
                cnt++;
            }
            if(cnt == 3) return;
        }
    }
}
class person{
    int nation;
    int number;
    int point;

    public person(int nation, int number, int point) {
        this.nation = nation; this.number = number; this.point = point;
    }
}