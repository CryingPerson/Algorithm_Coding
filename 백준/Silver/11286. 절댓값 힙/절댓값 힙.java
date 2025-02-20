
import java.util.*;

public class Main {
    static int INF = Integer.MAX_VALUE;
    static int[] ch;
    static ArrayList<ArrayList<Integer>> list;
    static int m;
    static int n;
    static int[][] board;
    static int[][] dis;
    static int[] answer;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] ans;
    static int zero = 0;
    static int one = 0;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        n = kb.nextInt();
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) ->{
            if(Math.abs(o1) == Math.abs(o2)){
                return o1 - o2;
            }else return Math.abs(o1) - Math.abs(o2);
        }
        );

        for (int i = 0; i < n; i++) {
            int command = kb.nextInt();

            if(command == 0){
                if(queue.isEmpty()){
                    System.out.println(0);
                }else{
                    Integer poll = queue.poll();
                    System.out.println(poll);
                }
            }else{
                queue.add(command);
            }
        }
    }

}

