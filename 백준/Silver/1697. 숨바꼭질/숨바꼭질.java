import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int[] ch;  // 방문 체크 배열

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // 현재 위치
        int m = sc.nextInt();  // 목표 위치
        ch = new int[100001];  // 최대 범위 100000까지

        Queue<Integer> queue = new LinkedList<>();
        queue.add(n);
        ch[n] = 1;  // 방문 체크 (1부터 시작)

        int answer = 0;  // 이동 횟수

        while (!queue.isEmpty()) {
            int size = queue.size();
            
            for (int i = 0; i < size; i++) {
                int poll = queue.poll();

                // 목표 위치 도착 시 즉시 출력 후 종료
                if (poll == m) {
                    System.out.println(answer);
                    return;  // 프로그램 종료
                }

                int[] next = {poll - 1, poll + 1, poll * 2};

                for (int nx : next) {
                    if (nx >= 0 && nx <= 100000 && ch[nx] == 0) {
                        ch[nx] = 1;  // 방문 체크
                        queue.add(nx);
                    }
                }
            }
            answer++;  // BFS의 레벨 증가 (시간 증가)
        }
    }
}
