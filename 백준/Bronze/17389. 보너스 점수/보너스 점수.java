import java.util.*;
class Main {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static boolean[][] snake;
    static int[][] board;
    static char[][] star;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String answer = sc.nextLine();

        int total = 0;
        int bonus = 0;
        for (int i = 1; i <= answer.length(); i++) {
            if(answer.charAt(i - 1) == 'O'){
                total += i + bonus;
                bonus++;
            }else{
                bonus = 0;
            }
        }
        System.out.println(total);
    }
}