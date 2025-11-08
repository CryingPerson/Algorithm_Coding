    import java.util.*;

    public class Main {
        static char[][] grid = new char[10][10];

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            Queue<info> queue = new LinkedList<>();
            sc.nextLine();
            for (int i = 0; i < n; i++) {

                info s = new info(i);

                String ss = sc.nextLine();
                for(String sss : ss.split(" "))
                s.queue.add(sss);
                queue.add(s);
            }
            String ans = sc.nextLine();

            Queue<String> answer = new LinkedList<>();

            for(String an : ans.split(" ")) answer.add(an);

            while (!answer.isEmpty()) {
                String poll = answer.poll();

                boolean ok = true;
                for (info ss : queue) {
                    String peek = ss.queue.peek();
                    if(!ss.queue.isEmpty() && peek.equals(poll)){
                        ss.queue.poll();
                        ok = false;
                    }
                }
                if(ok){
                    System.out.println("Impossible");
                    return;
                }
            }
            for (info ss : queue) {
                if (!ss.queue.isEmpty()) {
                    System.out.println("Impossible");
                    return;
                }
            }
            System.out.println("Possible");
        }
    }
    class info{
        int idx;
        Queue<String> queue = new LinkedList<>();

        public info(int ind) {
            this.idx = ind;
        }
    }
