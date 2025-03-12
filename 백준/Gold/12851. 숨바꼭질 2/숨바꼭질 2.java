import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Main {
    public static int[] ch;
    public static int MinL = Integer.MAX_VALUE; // 최단 거리 초기화
    public static int cnt = 0; // 최단 거리로 도달하는 방법의 개수
    public static int m;
    public static int[] dx = {-1, 1}; // 걷기 이동

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        m = kb.nextInt();
        ch = new int[100001]; // 방문 시간을 저장하는 배열

        BFS(n);

        System.out.println(MinL);
        System.out.println(cnt);
    }

    public static void BFS(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        ch[start] = 1; // 시작 위치의 방문 시간(1초) 설정
        int L = 0;  // 현재 레벨(초 단위)

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int poll = queue.poll();

                // 동생 위치 찾았을 경우
                if (poll == m) {
                    if (MinL > L) {
                        MinL = L;  // 최단 거리 갱신
                        cnt = 1;   // 새로운 최단 거리 발견 → 방법 개수 초기화
                    } else if (MinL == L) {
                        cnt++;  // 같은 최단 거리 경로 추가
                    }
                }

                // 걷기 이동
                for (int j = 0; j < 2; j++) {
                    int nx = poll + dx[j];
                    if (nx >= 0 && nx <= 100000) {
                        // 처음 방문하거나, 최단 거리와 같은 경우에만 탐색
                        if (ch[nx] == 0 || ch[nx] == L + 1) {
                            ch[nx] = L + 1; // 현재 이동 거리 저장
                            queue.add(nx);
                        }
                    }
                }

                // 순간이동 (X * 2)
                int nx = poll * 2;
                if (nx >= 0 && nx <= 100000) {
                    if (ch[nx] == 0 || ch[nx] == L + 1) {
                        ch[nx] = L + 1; // 현재 이동 거리 저장
                        queue.add(nx);
                    }
                }
            }
            L++;
        }
    }
}
