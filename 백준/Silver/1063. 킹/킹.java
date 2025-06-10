import java.util.*;

public class Main {
    static int[][] board;
    static int nxK = 0;
    static int nyK = 0;
    static int nstoneXK = 0;
    static int nstobeYK = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();
        int N = sc.nextInt();
        sc.nextLine();
        board = new int[9][9];
        int KingX = (a.charAt(1) - '1') + 1;
        int KingY = (a.charAt(0) - 'A') + 1;
        nxK = KingX;
        nyK = KingY;
        int stoneX = (b.charAt(1) - '1') + 1;
        int stoneY = (b.charAt(0) - 'A') + 1;

        nstoneXK = stoneX;
        nstobeYK = stoneY;


        for (int i = 0; i < N; i++) {
            String word = sc.nextLine();
            move(nxK, nyK, nstoneXK, nstobeYK, word);
        }

        String abs = "";
        String abs2 = "";
        abs += (char)((nyK + 'A') - 1);
        abs += String.valueOf(nxK);


        abs2 += (char)((nstobeYK + 'A') - 1);
        abs2 += String.valueOf(nstoneXK);
        System.out.println(abs);
        System.out.println(abs2);
    }

    public static void move(int kingX, int kingY, int stoneX, int stoneY, String word) {
        if (word.equals("R")) {
            kingY++;
            stoneY++;
        } else if (word.equals("L")) {
            kingY--;
            stoneY--;
        } else if (word.equals("B")) {
            kingX--;
            stoneX--;
        } else if (word.equals("T")) {
            kingX++;
            stoneX++;
        } else if (word.equals("RT")) {
            kingX++; stoneX++;
            kingY++; stoneY++;
        } else if (word.equals("LT")) {
            kingX++; stoneX++;
            kingY--; stoneY--;
        } else if (word.equals("RB")) {
            kingX--; stoneX--;
            kingY++; stoneY++;
        }else {
            kingX--; stoneX--;
            kingY--; stoneY--;
        }
        if (kingX >= 1 && kingX <= 8 && kingY >= 1 && kingY <= 8) {
            if(kingX != nstoneXK || kingY != nstobeYK){
                nxK = kingX;
                nyK = kingY;
            }else if(kingX == nstoneXK && kingY == nstobeYK){
                if (stoneX >= 1 && stoneX <= 8 && stoneY >= 1 && stoneY <= 8) {
                    nxK = kingX;
                    nyK = kingY;
                    nstoneXK = stoneX;
                    nstobeYK = stoneY;
                }
            }
        }
    }
}
