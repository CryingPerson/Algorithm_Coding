import java.util.*;
class Solution {
        static int[][] board = new int[11][11]; // -5 ~ 5의 범위를 0 ~ 10으로 매핑
    static int[] dx = {1, -1, 0, 0}; // U, D, L, R
    static int[] dy = {0, 0, -1, 1}; // U, D, L, R
    static Set<String> set = new HashSet();
    
    public int solution(String dirs) {
        int answer = 0;
        int x = 5; // 시작점 (0, 0) -> 배열에서 (5, 5)
        int y = 5;

        for (char command : dirs.toCharArray()) {
            int dir = getDirection(command);
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            // 좌표가 경계 안에 있는지 확인
            if (nx >= 0 && nx < 11 && ny >= 0 && ny < 11) {
                
                String path1 = x + "," + y + "," + nx + "," + ny;
                String path2 = nx + "," + ny + "," + x + "," + y;
                
                if(!set.contains(path1) && !set.contains(path2)){
                    answer++;
                    set.add(path1);
                    set.add(path2);
                }
                x = nx;
                y = ny;
            }
        }
        return answer;
    }

    // 방향 명령어를 인덱스로 변환
    private int getDirection(char command) {
        switch (command) {
            case 'U': return 0;
            case 'D': return 1;
            case 'L': return 2;
            case 'R': return 3;
        }
        return -1; // 불가능한 경우 (없음)
    }
}
