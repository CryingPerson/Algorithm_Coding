class Solution {
        static int[] dx = {1, -1, -1, 1};
    static int[] dy = {1, 1, -1, -1};
    static boolean[][] snake;
    static int[][] board;
    static int n;
    static int count = 0;
    static boolean[][] visited;
    public int solution(int n) {
        int answer = 0;
        
        visited = new boolean[n][n];
        board = new int[n][n];

        DFS(0, 0, n);
        return count;
    }
     static void DFS(int x, int y, int n) {

        if (x == n) {
            count++;
            return;
        }

        for (int i = 0; i < n; i++) {
            if (board[x][i] == 0) {
                if (valid(x, i, n)) {
                    board[x][i] = 1;
                    DFS(x + 1, 0, n);
                    board[x][i] = 0;
                }
            }
        }

    }

    static boolean valid(int x, int y, int n) {
        for (int i = 0; i < n; i++) {
            if (board[i][y] == 1) return false;
        }

            for (int i = 1; x - i >= 0 && y - i >= 0; i++) {
        if (board[x - i][y - i] == 1) return false;
    }

    // 오른쪽 위 대각선 검사
    for (int i = 1; x - i >= 0 && y + i < n; i++) {
        if (board[x - i][y + i] == 1) return false;
    }
        return true;
    }
}