import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();
        char[][] cloud = new char[a][b];

        for (int i = 0; i < a; i++) {
            String s = sc.nextLine();
            for (int j = 0; j < b; j++) {
                cloud[i] = s.toCharArray();
            }
        }
        int[][] answer = new int[a][b];
        for (int i = 0; i < a; i++) {
            int cnt = 0;
            boolean flag = false;
            for (int j = 0; j < b; j++) {
                if(cloud[i][j] == 'c'){
                    cnt = 0;
                    answer[i][j] = cnt;
                    flag = true;
                } else if (cloud[i][j] == '.') {
                    if(flag){
                        answer[i][j] = cnt;
                    }else{
                        answer[i][j] = -1;
                    }
                }
                if (flag) {
                    cnt++;
                }
            }
        }
        for (int[] x : answer) {
            for (int se : x) {
                System.out.print(se + " ");
            }
            System.out.println();
        }
    }
}
