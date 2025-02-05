import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
class node{
    int x;
    int y;
    public node(int x, int y){
        this.x = x;
        this.y = y;
    }
}
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int point = sc.nextInt();
        int line = sc.nextInt();
        int start = sc.nextInt();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i = 0; i<=point; i++){
            list.add(new ArrayList<>());
        }
        for(int i = 0; i<line; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            list.get(a).add(b);
            list.get(b).add(a);

        }
        for(ArrayList<Integer> ed : list){
            Collections.sort(ed);
        }
        int[] solution = Solution.solution(point, list, start);
        for(int x : Solution.DFS(point, list, start)) {
            System.out.print(x + " ");
        }
        System.out.println();

        for(int x : Solution.solution(point, list, start)){
            System.out.print(x + " ");
        }
    }

}
class Solution {
    static int[] che;
    static List<Integer> result;
    public static int[] solution(int n, ArrayList<ArrayList<Integer>> list,int start) {

        Queue<Integer> queue = new LinkedList<>();
        int[] ch = new int[n+1];
        ch[start] = 1;
        queue.add(start);
        List<Integer> list1 = new ArrayList<>();
        while (!queue.isEmpty()){
            int poll = queue.poll();
            list1.add(poll);
            for(int nv : list.get(poll)){
                if(ch[nv] == 0){
                    ch[nv] = 1;
                    queue.add(nv);
                }
            }
        }

        return list1.stream().mapToInt(i -> i).toArray();
    }
    public static int[] DFS(int n, ArrayList<ArrayList<Integer>> list,int start){
       result = new ArrayList<>();
       che = new int[n+1];

        DF(list, start);

        return result.stream().mapToInt(i -> i).toArray();
    }
    public static void DF(ArrayList<ArrayList<Integer>> list,int start){
        che[start] = 1;
        result.add(start);

        for(int nx : list.get(start)){
            if(che[nx] == 0){
                DF(list,nx);
            }
        }
    }
}