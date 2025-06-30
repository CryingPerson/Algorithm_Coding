import java.util.*;

public class Main {
    static int[][] ans;
    static int idx = 0;
    static int x = 0;
    static int y = 0;
    static char[] ch = {'R', 'S', 'W', 'N'};
    static char first = 'R';
    static boolean check = false;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt(); int N = sc.nextInt();

        ans = new int[M][M];

        sc.nextLine();
        for (int i = 0; i < N; i++) {
            String cmd = sc.next();
            int num = sc.nextInt();

            move(cmd, num);
            if(check){
                System.out.println(-1);
                return;
            }
        }
        System.out.print(x + " ");
        System.out.println(y);
    }

    static void move(String cmd, int num) {
        if(cmd.equals("MOVE")){
            if(first == 'R'){
                x += num;
            }else if(first == 'S'){
                y -= num;
            }else if(first =='W'){
                x -= num;
            }else{
                y += num;
            }
            if(x < 0 || x >= ans.length || y < 0 || y >= ans.length){
                check = true;
            }
        }else{
            if(num == 0){
                if(first == 'R'){
                    first = 'N';
                }else if(first == 'N'){
                    first = 'W';
                }else if(first == 'W'){
                    first = 'S';
                }else{
                    first = 'R';
                }
            }else{
                if(first == 'R'){
                    first = 'S';
                }else if(first == 'S'){
                    first = 'W';
                }else if(first == 'W'){
                    first = 'N';
                }else{
                    first = 'R';
                }
            }
        }
    }
}

