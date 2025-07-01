import java.util.*;

public class Main {
    static int[][] ans;
    static int idx = 0;
    static int x = 0;
    static int y = 0;
    static Set<String> set = new HashSet<>();
    static String[][] ch = {{"q","w","e","r","t","y","u","i","o","p"},
            {"a","s","d","f","g","h","j","k","l"," "},
            {"z","x","c","v","b","n","m"," "," "," "}};
    static char first = 'R';
    static boolean check = false;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String[] st = new String[n];
        int idx = -1;
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            if(!s.equals("?")){
                set.add(s);
            }
            if(s.equals("?")){
                idx = i;
            }
            st[i] = s;
        }
        int m = sc.nextInt();
        sc.nextLine();
        String[] st2 = new String[m];
        for (int i = 0; i < m; i++) {
            st2[i] = sc.nextLine();
        }
        if(m == 1){
            System.out.println(st2[0]);
            return;
        }
        for(String s : st2){
            if(set.contains(s)){
            }else{
                if(m > 2 && idx > 0 && idx < n -1 && check(s, st[idx - 1], st[idx + 1])){
                    System.out.println(s);
                    break;
                }
                if(idx == 0){
                    if(check(s,st[idx+1])){
                        System.out.println(s);
                        break;
                    }
                }
                if(idx == n-1){
                    if(check1(s, st[idx - 1])){

                        System.out.println(s);
                        break;
                    }
                }
            }
        }
    }

    static boolean check(String s, String s1, String s2) {
        if(s.charAt(s.length()-1) == s2.charAt(0)
        && s1.charAt(s1.length() -1) == s.charAt(0) ) return true;

        return false;
    }
    static boolean check(String s, String s1){
        if(s.charAt(s.length()-1) == s1.charAt(0)) return true;
        return false;
    }
    static boolean check1(String s, String s2){
        if(s.charAt(0) == s2.charAt(s2.length()-1)) return true;
        return false;
    }
}

