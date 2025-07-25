import java.util.*;

public class Main {
    static int[][] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ans = "";
        for (int i = 0; i < 4; i++) {
            ans += sc.next();
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < ans.length(); i++) {
            String substring = ans.substring(i);
            String substring1 = ans.substring(0, i);

            String ass = substring + substring1;
            if(min > Integer.parseInt(ass)) min = Integer.parseInt(ass);
        }
        int cnt = 0;
        for (int i = 1111; i <= 9999; i++) {
            if(check(String.valueOf(i)) && !String.valueOf(i).contains("0")){
                if(min > i){
                    cnt++;
                }else{
                    break;
                }
            }
        }
        System.out.println(cnt + 1);
    }
    static boolean check(String s) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < s.length(); i++) {
            String substring = s.substring(i);
            String substring1 = s.substring(0, i);

            String ass = substring + substring1;
            if(min > Integer.parseInt(ass)) min = Integer.parseInt(ass);
        }
        if(min == Integer.parseInt(s)) return true;
        return false;
    }
}
