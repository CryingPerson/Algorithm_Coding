
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    static int INF = Integer.MAX_VALUE;
    static int[] ch;
    static ArrayList<ArrayList<Integer>> list;
    static int m;
    static int[] dis;
    static int answer = 0;
    static int[][] board;
    static int white = 0;
    static int blue = 0;
    static int[] dx = {-1, 1};

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        PriorityQueue<Integer> pq = new PriorityQueue<>((o1,o2) -> {
            if(Math.abs(o1) == Math.abs(o2)){
                return o1-o2;
            }else return Math.abs(o1) - Math.abs(o2);
        });
        int n = kb.nextInt();
        for (int i = 0; i < n; i++) {
            int num = kb.nextInt();
            if(num != 0){
                pq.add(num);
            }else{
                if(pq.isEmpty()){
                    System.out.println("0");
                }else{
                    System.out.println(pq.poll());
                }
            }
        }



    }

}

