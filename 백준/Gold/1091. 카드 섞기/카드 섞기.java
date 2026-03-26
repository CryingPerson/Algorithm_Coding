import java.util.*;

public class Main {
    static int T;
    static List<Integer>[][] gears;

    static int[] dist;
    static int n;
    static List<List<node>> list = new ArrayList<>();
    static int[] P;
    static int[] S;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         n = sc.nextInt();

         P = new int[n];
         S = new int[n];
        for (int i = 0; i < n; i++) {
            P[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            S[i] = sc.nextInt();
        }


        int cnt = 0;
        int[] temp = P.clone();
        int[] first = P.clone();
        int max = 1000000;
        while (true) {
            if(check(temp)){
                break;
            }

            int[] mix = mix(temp);

            boolean equals = Arrays.equals(mix, first);
            
            if(equals){
                System.out.println(-1);
                return;
            }
            temp = mix.clone();
            cnt++;


        }

        System.out.println(cnt);
    }

    static boolean check(int[] t) {
        int count = 0;
        for (int i = 0; i < t.length; i++) {

            int num = t[i];
            int idx = i % 3;

            if(num != idx) return false;
        }

        return true;
    }

    static int[] mix(int[] temp) {

        int[] te = new int[n];
        for (int i = 0; i < S.length; i++) {
            int num = temp[i];
            int swith = S[i];

            te[swith] = num;
        }
        return te;
    }

}

class node{
    int to;
    int cost;

    public node(int to, int cost) {
        this.to = to;
        this.cost = cost;
    }
}