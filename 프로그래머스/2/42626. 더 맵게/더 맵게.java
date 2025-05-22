import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue();
        for(int x : scoville) pq.add(x);
        boolean flag = false;
        while(pq.peek() < K && pq.size() >= 2){
            answer++;
            pq.add(pq.poll() + (pq.poll() * 2));
        }
      return (pq.peek() >= K) ? answer : -1;
    }
}