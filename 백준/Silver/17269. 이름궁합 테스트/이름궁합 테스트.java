import java.nio.IntBuffer;
import java.util.*;

public class Main {
    static int[] dx = {0, 1}; // 오른쪽, 아래
    static int[] dy = {1, 0};
    static int[][] board;
    static boolean[][] checked;
    static int xx;
    static int yy;
    static int[] alpabet = {3, 2, 1, 2, 4, 3, 1, 3, 1, 1, 3, 1, 3, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        sc.nextLine();

        String s1 = sc.next();
        String s2 = sc.next();

        char[] ch = new char[s1.length() + s2.length()];

        List<Integer> list = new LinkedList<>();
        int max = Math.max(s1.length(), s2.length());
        int min = Math.min(s1.length(), s2.length());
        int a = 0;
        if (min == s1.length()) {
            for (int i = 0; i < min * 2; i = i + 2) {
                ch[i] = s1.charAt(i / 2);
                ch[i + 1] = s2.charAt(i / 2);
                a += 2;
            }
            for (int i = s1.length(); i < s2.length(); i++) {
                ch[a] = s2.charAt(i);
                a++;
            }
        } else {
            for (int i = 0; i < min * 2; i = i + 2) {
                ch[i] = s1.charAt(i / 2);
                ch[i + 1] = s2.charAt(i / 2);
                a += 2;
            }
            for (int i = s2.length(); i < s1.length(); i++) {
                ch[a] = s1.charAt(i);
                a++;
            }

        }
        String ans = get(ch);

        if(ans.charAt(0) == '0'){
            System.out.println(ans.charAt(1) + "%");
        }else{
            System.out.println(ans + "%");
        }
    }

    static String get(char[] ch) {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < ch.length; i++) {
            list.add(alpabet[ch[i] - 'A']);
        }
        while (list.size() > 2){
            List<Integer> newList = new LinkedList<>();
            for (int i = 0; i < list.size()- 1; i++) {
                int n = (list.get(i) + list.get(i+1)) % 10;
                newList.add(n);
            }
            list = newList;
        }
        return String.valueOf(list.get(0)) + String.valueOf(list.get(1));
    }
}