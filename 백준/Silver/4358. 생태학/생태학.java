import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // HashMap: 나무 종 이름을 키로, 빈도수를 값으로 저장
        HashMap<String, Integer> map = new HashMap<>();
        int totalCount = 0;

        // 입력 받기 (입력이 끝날 때까지)
        while (sc.hasNextLine()) { // 다음 줄이 있을 때까지 계속 읽음
            String line = sc.nextLine().trim();
            if (line.isEmpty()) break;  // 빈 줄이 들어오면 종료
            map.put(line, map.getOrDefault(line, 0) + 1);
            totalCount++;
        }

        List<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list); // 사전 순으로 정렬

        // 각 종의 비율 계산 후 출력
        for (String x : list) {
            double numSize = (double) (map.get(x) * 100) / totalCount;
            System.out.printf("%s %.4f\n", x, numSize);
        }
    }
}
