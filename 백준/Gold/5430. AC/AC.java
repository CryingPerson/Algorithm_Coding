import java.sql.ClientInfoStatus;
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

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            String cmd = sc.next();

            int length = sc.nextInt();

            String s = sc.next();

            s = s.replace("[", "").replace("]", ""); // "1,2,3,4"
            String[] arr = s.split(",");

            String[] upArr = new String[length];

            boolean[] visited = new boolean[length];

            boolean change = true;
            for (int j = 0; j < length; j++) {
                upArr[j] = arr[j];
            }

            int start = 0;
            int last = length - 1;

            boolean end = false;
            for (char c : cmd.toCharArray()) {
                if(c == 'R'){
                    change = !change;
                }else{
                    if(last < 0 || start >= length){
                        System.out.println("error");
                        end = true;
                        break;
                    }
                    if (!change) {
                        visited[last] = true;
                        last--;
                    }else{
                        visited[start] = true;
                        start++;
                    }
                }
            }
            if(end) continue;
            StringBuilder sb = new StringBuilder();
            int count = 0;

            for (int j = 0; j < visited.length; j++) {
                if(!visited[j]) count++;
            }
            int cnt = 0;
            List<String> list = new ArrayList<>();
            if (!change) {
                sb.append("[");
                for (int j = length - 1; j >= 0; j--) {
                    if(!visited[j]) list.add(upArr[j]);
                }
            }else{
                sb.append("[");
                for (int j = 0; j < length; j++) {
                    if(!visited[j]) list.add(upArr[j]);
                }
            }
            if(list.isEmpty()){
                System.out.println("[]");
                continue;
            }

            for (int j = 0; j < list.size() - 1; j++) {
                sb.append(list.get(j)).append(",");
            }

            sb.append(list.get(list.size() - 1)).append("]");


            System.out.println(sb);

        }
    }
}