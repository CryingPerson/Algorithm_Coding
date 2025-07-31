import java.io.*;
import java.util.*;

class Main {
    static char[][] board;
    static int[] dx = {-1, 0, 1, 0}; // U R D L
    static int[] dy = {0, 1, 0, -1};
    static int[] arr;
    static boolean[] visited;
    static int cnt = 0;
    static Set<String> set = new HashSet<>();

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String[] split = s.split(":");
        visited = new boolean[3];
        int [] aa = new int[3];
        String[] sttt = new String[3];
        DFS(0,split, sttt, aa);

        System.out.println(cnt);
    }

    static void DFS(int depth, String[] strings, String[] answer, int []aa) {
        if(depth == 3){
            if (lst(answer)) {
                cnt++;
            }
        }else{
            for (int i = 0; i < 3; i++) {
                if(!visited[i]){
                    aa[depth] = i+1;
                    answer[depth] = strings[i];
                    visited[i] = true;
                    DFS(depth+ 1, strings, answer, aa);
                    visited[i] = false;
                }
            }
        }
    }

    static boolean lst(String[] answer) {

        int hour = Integer.parseInt(answer[0]);
        int minute = Integer.parseInt(answer[1]);
        int second = Integer.parseInt(answer[2]);

        if (!(1 <= hour && hour <= 12)) return false;
        if (!(0 <= minute && minute <= 59)) return false;
        if (!(0 <= second && second <= 59)) return false;

        return true;
    }

    static boolean firstCheck(String[] dt) {
        int cnt = 0;
        for (String s : dt) {
            int i = Integer.parseInt(s);
            if(i >= 13) cnt++;
        }
        for (int i = 0; i < dt.length; i++) {
            int i1 = Integer.parseInt(dt[i]);
            if(i1 >= 60) return true;
        }
        if(cnt == 3) return true;
        return false;
    }

    static boolean zeroCheck(String[] strings) {
        boolean flag = false;
        for (String s : strings) {
            if (!s.equals("00")) {
                return false;
            }
        }
        return true;
    }

    static boolean allcheck(String[] strings) {
        for (int i = 0; i < strings.length - 1; i++) {
            if(!strings[i].equals(strings[i+1])){
                return false;
            }
        }
        return true;
    }

    static boolean check(int num) {
        int min = 3600;
        int max = 12 * 3600;

        if(min <= num && num <= max) return true;

        return false;
    }

    static int get(String s) {
        int hour = Integer.parseInt(s) * 3600;

        return hour;
    }
}
