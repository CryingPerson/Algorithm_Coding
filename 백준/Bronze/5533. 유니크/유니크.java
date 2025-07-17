import java.util.*;

public class Main {
    static char[][] DNA = {{'A', 'C', 'A', 'G'}, {'C', 'G', 'T', 'A'},
            {'A', 'T', 'C', 'G'}, {'G', 'A', 'G', 'T'}};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Map<Integer, Integer> map  =new HashMap<>();
        int[][] games = new int[n][3];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                games[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                boolean check = false;
                for (int k = 0; k < n; k++) {
                    if(i == k && j == j) continue;
                    if(games[i][j] == games[k][j]){
                        check = true;
                    }
                }
                if (!check) {
                    sum += games[i][j];
                }
            }
            System.out.println(sum);
        }
    }

}
