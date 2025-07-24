import java.util.*;

public class Main {
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();


        long idx = 1;
        long idxxx = 0;
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <=n; i++) list.add(i);

        while (list.size() > 1){
            long time =  idx * idx * idx;

             idxxx = (idxxx + (time - 1) )% list.size();

            list.remove((int)idxxx);

            idx++;


        }
        System.out.println(list.get(0));
    }

}
