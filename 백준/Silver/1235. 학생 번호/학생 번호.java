import java.util.*;

public class Main {
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    static char[][] ans;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();
        String[] st = new String[N];
        for (int i = 0; i < N; i++) {
            String s = sc.nextLine();
            st[i] = s;
        }
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = st[0].length() - 1; j >= 0; j--) {
                List<String> list = new LinkedList<>();
                cnt++;
                for (int k = 0; k < N; k++) {
                    String substring = st[k].substring(j);
                    list.add(substring);
                }
                if(chekc(list)){
                    System.out.println(cnt);
                    return;
                }
            }
        }
    }

    static boolean chekc(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - 1; j++) {
                if(i == j) continue;
                if(Objects.equals(list.get(i), list.get(j))){
                    return false;
                }
            }
        }

        return true;
    }
}
