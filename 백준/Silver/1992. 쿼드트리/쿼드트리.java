import java.util.*;

public class Main {
    static int[][] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.nextLine();

        arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < n; j++) {
                arr[i][j] = line.charAt(j) - '0';
            }
        }

        recusive(0, 0, n);
        System.out.println(sb);
    }

    static void recusive(int x, int y, int size) {
        if(allSame(x,y,size)){
            sb.append(arr[x][y]);
            return;
        }

        size = size / 2;

        sb.append("(");
        recusive(x, y, size);
        recusive(x, y + size, size);
        recusive(x+size, y, size);
        recusive(x+ size, y + size , size);

        sb.append(")");
    }

    static boolean allSame(int x, int y, int size) {
        int num = arr[x][y];

        for (int i = x ; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if(num != arr[i][j]) return false;
            }
        }

        return true;
    }
}
