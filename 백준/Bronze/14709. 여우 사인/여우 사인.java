import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean[][] check = new boolean[5][5];

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            check[a][b] = true;
            check[b][a] = true;
        }

        boolean flag = check[0][2] && check[0][3] && check[2][3];

        int count = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = i+1; j < 5; j++) {
                if(check[i][j]){
                    count++;
                }
            }
        }
        if(flag && count == 3){
            System.out.println("Wa-pa-pa-pa-pa-pa-pow!");
        }else{
            System.out.println("Woof-meow-tweet-squeek");
        }

    }
}
