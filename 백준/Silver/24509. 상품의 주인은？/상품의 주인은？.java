import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] score = new int[n][4];
        for (int i = 0; i < n; i++) {
            int student = sc.nextInt() - 1;
            for (int j = 0; j < 4; j++) {
                score[student][j] = sc.nextInt();
            }
        }

        boolean[] receiveReward = new boolean[n];

        int[] answer = new int[4];
        for (int i = 0; i < 4; i++) {
            int max = -1;
            int studentNum = -1;
            for (int j = 0; j < n; j++) {
                if(receiveReward[j]) continue;
                if(max < score[j][i]){
                    max = score[j][i];
                    studentNum = j;
                }
            }
            answer[i] = studentNum + 1;
            receiveReward[studentNum] = true;
        }
        for(int x : answer) System.out.print(x + " ");
    }
}


