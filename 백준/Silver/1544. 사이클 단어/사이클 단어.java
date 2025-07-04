import java.util.*;

public class Main {

    static char[][] board;
    static int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
    static int[] dy = {-1,  0,  1, -1, 1, -1, 0, 1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        Queue<String> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.add(sc.nextLine());
        }

        int ans = 0;


        int idx = 0;
        while (!queue.isEmpty()) {
            String first = queue.poll();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String peek = queue.peek();
                if(check(first, peek)){
                    queue.poll();
                }else{
                    queue.poll();
                    queue.add(peek);
                }
            }
            ans++;
        }
        System.out.println(ans);
    }

    static boolean check(String s, String b) {
        if(s.length() != b.length()) return false;

        for (int i = 0; i < s.length(); i++) {
            String word = b.substring(i) + b.substring(0,i);
            if(s.equals(word)) return true;
        }
        return false;
    }
}

