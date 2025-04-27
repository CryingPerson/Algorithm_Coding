import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            int start = start(num);
            System.out.println(start);
        }
    }

    public static int start(int num) {
        boolean[] answer = new boolean[num+1];

        for(int i = 0; i <= num; i++) answer[i] = true;
        for (int i = 2; i <= num; i++) {
            for (int j = 1; j <= num && i * j <= num; j++) {
                if(answer[i * j]){
                    answer[i * j] = false;
                }else answer[i * j] = true;
            }
        }
        int cnt = 0;
        for (int i = 1; i <= num; i++) {
            if(answer[i]) cnt++;
        }

        return cnt;
    }
}
