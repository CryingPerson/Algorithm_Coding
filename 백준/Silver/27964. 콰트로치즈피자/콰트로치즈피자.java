import java.util.*;

public class Main {
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    static char[][] ans;
    static int idx = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] ans = new String[n];

        sc.nextLine();
        int count = 0;
        String s = sc.nextLine();
        String first = "";
        String[] st = s.split(" ");
        Set<String> strings = new HashSet<>();
        for (int i = 0; i < st.length; i++) {
            if(check(st[i])){
                if(!strings.contains(st[i].substring(0, idx))){
                    count++;
                    strings.add(st[i].substring(0, idx));
                }
            }
        }
        if(count >= 4){
            System.out.println("yummy");
        }else{
            System.out.println("sad");
        }



    }
    static boolean check(String s){
        String ss = "Cheese";
        if(s.length() < 6) return false;
        String substring = s.substring(s.length() - 6);

        if(ss.equals(substring)){
            idx = s.length()-6;
            return true;
        }
        return false;
    }
}

