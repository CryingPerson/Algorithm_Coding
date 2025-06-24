import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> q = new PriorityQueue();
        
        for(int x : scoville) q.add(x);
        
        boolean flag = true;
        
        while(q.size() > 1){
            if(q.peek() >= K){
                break;
            }else{
                int a = q.poll();
                int b = q.poll();
                int c = 0;
                c = a + (b * 2);
                q.add(c);
                answer++;
            }
        }
        if(q.poll() < K){
            return -1;
        }
        return answer;
    }
}