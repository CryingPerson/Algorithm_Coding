import java.math.BigInteger;
import java.util.*;

public class Main {
    static int mmii = Integer.MAX_VALUE;
    static List<int[]> answer;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = sc.nextInt();
        sc.nextLine();
        answer = new ArrayList<>();
        List<info> list = new ArrayList<>();
        for (int i = 0; i < sum; i++) {
            char[][] board = new char[5][7];
            for (int j = 0; j < 5; j++) {
                String line = sc.nextLine();
                for (int k = 0; k < 7; k++) {
                    board[j][k] = line.charAt(k);
                }
            }
            list.add(new info(board, i));
        }
        info[] arr = new info[2];
        simulation(0, 0, list, arr);
        for (int li[] : answer) {
            System.out.print(li[0]+1 + " ");
            System.out.println(li[1]+1);
        }
    }

    static int check(info[] arr) {
        int min = Integer.MAX_VALUE;
        int cnt = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                if(arr[0].board[i][j] != arr[1].board[i][j]){
                    cnt++;
                }
            }
        }
        min = Math.min(min,cnt);
        return min;
    }

    static void simulation(int start, int depth,List<info> list, info[] arr) {
        if(depth == 2){
            int check = check(arr);
            if(check < mmii){
                mmii = check;
                answer.clear();
                answer.add(new int[]{arr[0].idx, arr[1].idx});
            }
        }else{
            for (int i = start; i < list.size(); i++) {
                arr[depth] = list.get(i);
                simulation(i+1, depth+1, list, arr);
            }
        }
    }
}
class info{
    char[][] board;
    int idx;

    public info(char[][] board, int idx) {
        this.board = board;
        this.idx = idx;
    }
}
