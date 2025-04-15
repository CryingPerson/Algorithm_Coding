import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int[][] board = new int[N][M];

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<N; i++){
            StringTokenizer str = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++){
                board[i][j] = Integer.parseInt(str.nextToken());
                min = Math.min(min, board[i][j]);
                max = Math.max(max, board[i][j]);
            }
        }

        int resultTime = Integer.MAX_VALUE;
        int resultHeight = -1;

        // 땅 높이 h를 min ~ max까지 전부 시도
        for(int h=min; h<=max; h++){
            int remove = 0; // 제거할 블록 수
            int add = 0;    // 추가할 블록 수

            for(int i=0; i<N; i++){
                for(int j=0; j<M; j++){
                    int cur = board[i][j];
                    if(cur > h){
                        remove += (cur - h); // 블록 제거
                    }else if(cur < h){
                        add += (h - cur);    // 블록 추가
                    }
                }
            }

            // 인벤토리에 있는 블록으로 해결 가능한 경우만
            if(remove + B >= add){
                int time = remove * 2 + add; // 시간 계산

                // 시간이 적거나, 시간이 같으면 높은 높이 선택
                if(time < resultTime || (time == resultTime && h > resultHeight)){
                    resultTime = time;
                    resultHeight = h;
                }
            }
        }

        System.out.println(resultTime + " " + resultHeight);
    }
}
