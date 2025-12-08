import java.util.*;

class Main {
    static String[][] board;
    static int[][] origin;
    static List<int[]> temp;
    static boolean end = true;

    static int Size = 0;
    static int n, m, d;
    static List<int[]> removePoint;
    static int max = -1;

    static List<int[]> teacher;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static boolean[]visited;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Stack<Integer> st = new Stack<>();

        StringBuilder sb = new StringBuilder();
        int last = 1;
        int temp = last;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            if (st.isEmpty()) {
                st.push(last);
                last++;
                sb.append("+").append("\n");
                while (st.peek() != num) {
                    st.push(last);
                    sb.append("+").append("\n");
                    last++;
                }
            }

            if(!st.isEmpty() && st.peek() == num){
                st.pop();
                sb.append("-").append("\n");
            }else{
                while (st.peek() != num) {
                    if(last > n) {
                        System.out.println("NO");
                        return;
                    }
                    st.push(last);
                    sb.append("+").append("\n");
                    last++;
                }
                st.pop();
                sb.append("-").append("\n");
            }
        }
        System.out.println(sb);
    }
}