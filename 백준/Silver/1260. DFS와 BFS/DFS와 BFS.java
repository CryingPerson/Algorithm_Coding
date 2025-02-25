import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static ArrayList<ArrayList<Integer>> list1;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        ArrayList<int[]> list = new ArrayList<>();
         list1 = new ArrayList<>();
        int n = sc.nextInt(); int m =sc.nextInt(); int start = sc.nextInt();
        int[] ch = new int[n+1];
        int[] ch2 = new int[n+1];
        ch[start] = 1;
        ch2[start] = 1;
        for (int i = 0; i <= n; i++) {
            list1.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            list1.get(a).add(b);
            list1.get(b).add(a);
        }
        for(ArrayList<Integer> list2 : list1){
            Collections.sort(list2);
        }
        DFS(start, ch);
        System.out.println();
        BFS(start, ch2);
    }

    public static void DFS(int start, int[]ch) {
        System.out.print(start + " ");
        for(int x : list1.get(start)){
            if(ch[x] == 0){
                ch[x] = 1;
                DFS(x, ch);
            }
        }
    }

    public static void BFS(int start, int[] ch2) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        ch2[start] = 1;
        while (!queue.isEmpty()){
            Integer poll = queue.poll();
            System.out.print(poll + " ");
            for(int x : list1.get(poll)){
                if(ch2[x] == 0){
                    ch2[x] = 1;
                    queue.add(x);
                }
            }
        }
    }
}
