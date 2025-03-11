import java.util.*;

class Main {
    public static int[] ch;
    public static int cnt;
    public static int minTime = Integer.MAX_VALUE;  // 최단 시간 저장
    public static int m;

    public static int[] dx = {-1, 1}; // 걷기 이동

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        kb.nextLine();
        for (int i = 0; i < n; i++) {
            String[] st = kb.nextLine().split(" ");
            for(String s : st){
                System.out.print(new StringBuilder(s).reverse());
                System.out.print(" ");
            }
            System.out.println();
        }


    }
}
