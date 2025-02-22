import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // 버퍼 비우기

        HashMap<Long, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            long num = sc.nextLong();
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Long> list = new ArrayList<>(map.keySet());

        // 정렬: (1) 개수 내림차순, (2) 숫자 오름차순
        list.sort((o1, o2) -> {
            int count1 = map.get(o1);
            int count2 = map.get(o2);

            if (count1 == count2) {
                return Long.compare(o1, o2); // 숫자가 작은 순서 (오름차순)
            }
            return Integer.compare(count2, count1); // 개수가 많은 순서 (내림차순)
        });

        // 가장 많이 나온 숫자 출력
        System.out.println(list.get(0));
    }
}
