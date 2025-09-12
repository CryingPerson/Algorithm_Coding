import java.util.*;

public class Main {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] board;
    static int n;
    static List<List<Integer>> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        board = new int[n][n];

        int[] arr = new int[n * n];
        for (int i = 0; i <= n * n; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < n * n; i++) {
            int num = sc.nextInt();
            arr[i] = num;
            for (int j = 0; j < 4; j++) {
                list.get(num).add(sc.nextInt());
            }
        }


        for (int i = 0; i < arr.length; i++) {
            int student = arr[i];

            int[] pos = simulation(student);
            board[pos[0]][pos[1]] = student;
        }
        int sum = print();
        System.out.println(sum);

    }
    static int print(){
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int cnt = 0;
                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];

                    if(nx < 0 || ny < 0 || nx >= n || ny >= n) continue;

                    if(list.get(board[i][j]).contains(board[nx][ny]))cnt++;
                }

                if(cnt == 1){
                    sum+= 1;
                }else if(cnt == 2){
                    sum += 10;
                }else if(cnt == 3){
                    sum += 100;
                }else if(cnt == 4)sum += 1000;
            }
        }
        return sum;
    }
    static int[] simulation(int student){
        List<info> list1 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(board[i][j] != 0) continue;
                int like = 0; int empty = 0;
                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];

                    if(nx < 0 || ny < 0 || nx >= n || ny >= n) continue;
                    if(board[nx][ny] == 0) empty++;
                    else if(list.get(student).contains(board[nx][ny])) like++;
                }
                list1.add(new info(like, empty, i, j));
            }
        }
        list1.sort((o1, o2) -> {
            if(o1.like != o2.like) return o2.like - o1.like;
            if(o1.empty != o2.empty) return o2.empty - o1.empty;
            if(o1.x != o2.x) return o1.x - o2.x;
            return o1.y - o2.y;
        });

        return new int[]{list1.get(0).x, list1.get(0).y};
    }
}
class info{
    int like;
    int empty;
    int x;
    int y;

    public info(int like, int empty, int x, int y) {
        this.like = like; this.empty = empty; this.x = x; this.y = y;
    }
}