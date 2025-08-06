import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        int[] paramCount = new int[26]; // A~Z에 대해 파라미터 개수 저장
        boolean[] visited = new boolean[26]; // 명령어 처음 등장 여부

        int i = 0; // 문자열 인덱스
        int memoryPos = 0; // 실제 메모리 위치
        int nopCount = 0;

        while (i < line.length()) {
            char cmd = line.charAt(i); // 명령어 (대문자)

            // 명령어는 무조건 대문자
            int idx = cmd - 'A';

            // 시작 위치가 4의 배수가 아니면 NOP 삽입
            if (memoryPos % 4 != 0) {
                int need = 4 - (memoryPos % 4);
                nopCount += need;
                memoryPos += need;
            }

            // 파라미터 개수 계산
            int param = 0;
            int j = i + 1;
            if (!visited[idx]) {
                while (j < line.length() && Character.isLowerCase(line.charAt(j))) {
                    param++;
                    j++;
                }
                paramCount[idx] = param;
                visited[idx] = true;
            } else {
                param = paramCount[idx];
                j = i + 1 + param;
            }

            // 명령어 + 파라미터 처리
            memoryPos += 1 + param;
            i = j; // 다음 명령어로 이동
        }

        System.out.println(nopCount);
    }
}
