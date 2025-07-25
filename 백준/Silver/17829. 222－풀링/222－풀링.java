import java.util.*;

public class Main {
    static int[][] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        arr = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(recusive(0, 0, N));
    }

    static int recusive(int x, int y, int size) {
        if (size == 2) {
            int temp[] = new int[4];

            temp[0] = arr[x][y];
            temp[1] = arr[x][y + 1];
            temp[2] = arr[x + 1][y];
            temp[3] = arr[x + 1][y + 1];

            Arrays.sort(temp);

            return temp[2];
        }

        size = size / 2;
        
        int[] temp = new int[4];
        temp[0] = recusive(x , y , size);
        temp[1] = recusive(x , y + size, size);

        temp[2] = recusive(x+size, y, size);
        temp[3] = recusive(x+size, y + size, size);
        
        Arrays.sort(temp);
        return temp[2];
    }
}
