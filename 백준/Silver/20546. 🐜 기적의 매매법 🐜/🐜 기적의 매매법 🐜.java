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

        int n = sc.nextInt();

        int[] zusci = new int[14];

        int temp = n;
        for(int i = 0; i < 14; i++) zusci[i] = sc.nextInt();

        int jun = 0;
        for (int i = 0; i < 14; i++) {
            int curPrice = zusci[i];

            if (curPrice <= n) {
                jun += n / curPrice;
                n %= curPrice;
            }
        }
        int junPrice = jun * zusci[13];

        if(n != 0) junPrice += n;
        int sung = 0;

        boolean masu = true;
        boolean mado = true;
        int save = temp;
        int price = 0;
        for (int i = 0; i < 11; i++) {
            int one = zusci[i];
            int two = zusci[i + 1];
            int three = zusci[i + 2];

            int four = zusci[i + 3];
            if (one < two && two < three) {
                price += sung * four;
                if(price == 0) continue;
                save = price;
                sung = 0;
            }else if(one > two && two > three){
                if(save > four){
                    sung += save / four;
                    save %= four;
                }
            }
        }
        if(price == 0){
            price += sung * zusci[13];
            if(save != 0) price += save;
        }

        if (junPrice > price) {
            System.out.println("BNP");
        } else if (junPrice < price) {
            System.out.println("TIMING");
        }else System.out.println("SAMESAME");
    }
}