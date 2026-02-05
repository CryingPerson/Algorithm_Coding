import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] mirror = new char[n][n];

        for (int i = 0; i < n; i++) {
            mirror[i] = sc.next().toCharArray();
        }

        int state = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        if (state == 1) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) sb.append(mirror[i][j]);
                sb.append("\n");
            }
        } else if (state == 2) {
            for (int i = 0; i < n; i++) {
                for (int j = n - 1; j >= 0; j--) sb.append(mirror[i][j]);
                sb.append("\n");
            }
        } else if (state == 3) {
            for (int i = n - 1; i >= 0; i--) {
                for (int j = 0; j < n; j++) sb.append(mirror[i][j]);
                sb.append("\n");
            }
        }

        System.out.print(sb.toString());
    }
}