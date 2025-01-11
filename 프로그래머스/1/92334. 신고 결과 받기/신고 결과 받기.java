import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, HashMap<String, Integer>> map = new HashMap<>();
        Map<String, Integer> idxMap = new HashMap<>();

        // 초기화
        for (int i = 0; i < id_list.length; i++) {
            String name = id_list[i];
            map.put(name, new HashMap<>());
            idxMap.put(name, i);
        }

        // report를 기반으로 map 업데이트
        for (String s : report) {
            String[] str = s.split(" ");
            String from = str[0];
            String to = str[1];

            // 신고를 처음 하면 1로 초기화, 이미 했다면 아무 변화 없음
            map.get(to).put(from, map.get(to).getOrDefault(from, 0) + 1);
        }

        // k번 이상 신고된 경우 처리
        for (int i = 0; i < id_list.length; i++) {
            String reported = id_list[i];
            HashMap<String, Integer> senders = map.get(reported);

            if (senders.size() >= k) {
                for (String sender : senders.keySet()) {
                    answer[idxMap.get(sender)]++;
                }
            }
        }

        return answer;
    }
}