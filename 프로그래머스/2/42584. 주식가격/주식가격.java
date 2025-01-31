import java.util.*;
class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        Queue<Integer> q = new LinkedList();
        
        for(int x : prices) q.add(x);
        int cnt = 0;
        for(int i = 0; i<prices.length; i++){
            cnt = 0;
            for(int j = i+1; j<prices.length; j++){
                if(prices[i] <= prices[j]) cnt++;
                else {
                    cnt++;
                    break;
                }
            }
            answer[i] = cnt;
        }
        return answer;
    }
}