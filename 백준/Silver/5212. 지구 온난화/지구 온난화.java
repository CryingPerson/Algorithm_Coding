import java.util.*;

public class Main {
    static char[][] arr;
    static StringBuilder sb = new StringBuilder();
    static char[][] temp;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0 , 1, 0, -1};
    static List<int[]> list = new ArrayList<>();
    static int MaxX = Integer.MIN_VALUE;
    static int MinX = Integer.MAX_VALUE;

    static int MAXY = Integer.MIN_VALUE;
    static int MINY = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt(); int y = sc.nextInt();

        sc.nextLine();

        arr = new char[x][y];
        temp = new char[x][y];
        for (int i = 0; i < x; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < y; j++) {
                arr[i][j] = line.charAt(j);
                temp[i][j] = line.charAt(j);
            }
        }

        simul();
        find();
        answer();
        for (int i = MinX; i <= MaxX; i++) {
            for (int j = MINY; j <= MAXY; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }


    }
    static void answer(){


        for (int[] li : list) {
            if(li[0] > MaxX) MaxX = li[0];
            if(li[0] < MinX) MinX = li[0];
            if(li[1] > MAXY) MAXY = li[1];
            if(li[1] < MINY) MINY = li[1];
        }
    }
    static void find(){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] == 'X') list.add(new int[]{i,j});
            }
        }
    }
    static void simul(){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                int cnt = 0;
                if(arr[i][j] == 'X'){
                    for (int k = 0; k < 4; k++) {
                        int nx = i + dx[k];
                        int ny = j + dy[k];

                        if(nx < 0 || nx >= arr.length || ny < 0 || ny >= arr[0].length){
                            cnt++;
                        } else if(temp[nx][ny] == '.'){
                            cnt++;
                        }
                    }
                }
                if(cnt >= 3){
                    arr[i][j] = '.';
                }
            }
        }
    }
}
