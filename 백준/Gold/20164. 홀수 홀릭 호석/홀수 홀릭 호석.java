import java.util.*;
class Main {
    static int[][] board;
    static List<int[][]> list;
    static boolean ok = false;
    static Set<Integer> set;
    static int ax, ay, stx, sty;
    static int[] dx = {-1 , 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int max = 0;
    static int min = Integer.MAX_VALUE;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        recusive(s, check(Integer.parseInt(s)));
        System.out.print(min + " " + max);
    }

    static void recusive(String s, int sum) {
        if (s.length() == 1) {
            max = Math.max(max, sum);
            min = Math.min(min, sum);
            return;
        }

        if (s.length() == 2) {
            int a = Integer.parseInt(String.valueOf(s.charAt(0)));
            int b = Integer.parseInt(String.valueOf(s.charAt(1)));

            int c = a + b;

            recusive(String.valueOf(c),sum +  check(c));
        }else{
            for (int i = 1; i < s.length(); i++) {
                for (int j = i + 1; j < s.length(); j++) {
                    String a = s.substring(0,i);
                    String b = s.substring(i, j);
                    String c = s.substring(j);

                    int next = Integer.parseInt(a) + Integer.parseInt(b) + Integer.parseInt(c);

                    recusive(String.valueOf(next), sum + check(next));
                }
            }
        }


    }

    static int check(int num) {
        int c = 0;

        for(char cc : String.valueOf(num).toCharArray()){
            int n = cc - '0';

            if (n % 2 != 0) {
                c++;
            }
        }
        return c;
    }
}