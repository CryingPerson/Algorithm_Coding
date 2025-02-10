
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int[] ch;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int second = 1;
        int n = sc.nextInt();
        int m = sc.nextInt();
        ch = new int[100001];
        ch[n] = 1;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(n);
        int answer = 0;
       int da = 0; int db = 0; int dc = 0;
        while (!queue.isEmpty()) {

            int size = queue.size();
            for(int i = 0; i<size; i++){
                int poll = queue.poll();
                if(poll == m) {
                    System.out.println(answer);
                    return;
                }
                da = poll - 1;
                db = poll + 1;
                dc = poll * 2;
                if (da == m) {
                    System.out.println(answer+1);
                    return;
                } else if (db == m) {
                    System.out.println(answer+1);
                    return;
                } else if (dc == m) {
                    System.out.println(answer+1);
                    return;
                } else {
                    if(da >= 0 && da <=100000 && ch[da] == 0){
                        ch[da] = 1;
                        queue.add(da);
                    }
                    if(db >= 0 && db <=100000 && ch[db] == 0){
                        ch[db] = 1;
                        queue.add(db);
                    }
                    if(dc >= 0 && dc <=100000 && ch[dc] == 0){
                        ch[dc] = 1;
                        queue.add(dc);
                    }
                }
            }
            answer++;
        }
        System.out.println(-1);
    }
}