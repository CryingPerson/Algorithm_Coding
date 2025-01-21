import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> daysQueue = new LinkedList<>();
        List<Integer> resultList = new ArrayList<>();
        
        // 각 작업이 완료되기까지 걸리는 일수를 계산하여 큐에 저장
        for (int i = 0; i < progresses.length; i++) {
            int remainingWork = 100 - progresses[i];
            int days = (int) Math.ceil((double) remainingWork / speeds[i]);
            daysQueue.add(days);
        }
        
        while (!daysQueue.isEmpty()) {
            int currentDay = daysQueue.poll(); // 현재 배포 기준일
            int count = 1; // 현재 작업 포함
            
            // 현재 배포 기준일 내에 완료되는 작업들을 확인
            while (!daysQueue.isEmpty() && daysQueue.peek() <= currentDay) {
                daysQueue.poll();
                count++;
            }
            
            resultList.add(count);
        }
        
        // 결과 리스트를 배열로 변환
        int[] answer = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            answer[i] = resultList.get(i);
        }
        
        return answer;
    }
}
