import java.util.Scanner;

public class Main {
    static int[] dx = {0, 0, -1, 1}; // 상하좌우 이동
    static int[] dy = {-1, 1, 0, 0};
    static boolean[][] paper = new boolean[101][101]; // 도화지

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 색종이 개수

        // 색종이 위치 입력받아 표시
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    paper[j][k] = true;
                }
            }
        }

        // 둘레 계산
        int perimeter = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (paper[i][j]) { // 색종이가 있는 칸이면
                    for (int d = 0; d < 4; d++) { // 4방향 확인
                        int nx = i + dx[d];
                        int ny = j + dy[d];

                        // 범위를 벗어나거나, 색종이가 없는 곳이면 테두리
                        if (nx >= 0 && nx <= 100 && ny >= 0 && ny <= 100 && !paper[nx][ny]) {
                            perimeter++;
                        }
                    }
                }
            }
        }

        System.out.println(perimeter);
        sc.close();
    }
}
