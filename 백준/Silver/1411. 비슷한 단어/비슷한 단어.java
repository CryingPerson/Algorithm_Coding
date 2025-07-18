import java.util.*;

public class Main {
    static int[] dx = {-1, 0 , 1 , 0};
    static int[] dy = {0 , 1, 0, -1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.nextLine();
        String[] st = new String[n];
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            st[i] = s;
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if(simul(st[i], st[j])){
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }

    static boolean simul(String a, String b) {

        if(a.length() != b.length()) return false;
        HashMap<Character, Character> map = new HashMap<>();

        HashMap<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            char ch2 = b.charAt(i);

            if(map.containsKey(ch)){
                if(map.get(ch) != ch2) return false;
            }else{
                map.put(ch, ch2);
            }

            if(map2.containsKey(ch2)){
                if(map2.get(ch2) != ch) return false;
            }else{
                map2.put(ch2, ch);
            }
        }

        return true;
    }
}