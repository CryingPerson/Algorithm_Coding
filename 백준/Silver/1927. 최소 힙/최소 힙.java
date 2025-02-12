import java.util.*;

public class Main {
    static int[][] board;
    static int white = 0;
    static int blue = 0;
    static ArrayList<ArrayList<Integer>> list;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    static int[][] dis;
    static Queue<point> queue;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        PriorityQueue<Integer> list1 = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if(num == 0){
                if(!list1.isEmpty()){
                    System.out.println(list1.poll());
                }else{
                    System.out.println(0);
                }
            }else{
                list1.add(num);
            }
        }
    }
}
class point{
    int x;
    int y;
    public point(int x, int y){
        this.x = x;
        this.y = y;
    }
}