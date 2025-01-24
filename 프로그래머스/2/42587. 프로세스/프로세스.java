import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        PriorityQueue<Integer> pQ = new PriorityQueue(Collections.reverseOrder());
        
        for(int x : priorities) pQ.add(x);
        
        int cnt = 0;
        while(!pQ.isEmpty()){
            for(int i = 0; i<priorities.length; i++){
                if(pQ.peek() == priorities[i]){
                    pQ.poll();
                    cnt++;
                    
                    if(i == location){
                        return cnt;
                    }
                }
            }
        }
        return answer;
    }
}