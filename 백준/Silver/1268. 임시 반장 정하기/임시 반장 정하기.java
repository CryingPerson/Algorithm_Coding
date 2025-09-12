import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int[][] classes = new int[a][5];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < 5; j++) {
                classes[i][j] = sc.nextInt();
            }
        }

        int cnt = 0;
        int max = -1;
        int save = -1;
        for (int i = 0; i < a; i++) {
            cnt = 0;
            for (int j = 0; j < a; j++) {
                for (int k = 0; k < 5; k++) {
                    if (classes[i][k] == classes[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if(max < cnt) {
                save = i+1;
                max = cnt;
            }
        }
        System.out.println(save);
    }
}
