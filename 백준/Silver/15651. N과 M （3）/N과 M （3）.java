import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder result = new StringBuilder(); // ✅ 전역 StringBuilder 사용

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(str.nextToken()); // N (1~N까지 숫자 사용)
        int m = Integer.parseInt(str.nextToken()); // M (M개 선택)

        int[] arr = new int[m]; // 선택된 숫자 저장 배열

        dfs(n, m, 0, arr);

        System.out.print(result); // ✅ 한 번만 출력하여 성능 향상
    }

    public static void dfs(int n, int m, int depth, int[] arr) {
        if (depth == m) { // ✅ M개 선택 완료 시 출력
            for (int i = 0; i < m; i++) {
                result.append(arr[i]).append(" ");
            }
            result.append("\n");
            return;
        }

        for (int i = 1; i <= n; i++) { // ✅ 중복 선택 가능 (방문 체크 필요 없음)
            arr[depth] = i; // 현재 자리에 i 할당
            dfs(n, m, depth + 1, arr); // 다음 자리 탐색
        }
    }
}
