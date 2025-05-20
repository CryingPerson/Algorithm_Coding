import java.util.*;
class Solution {
    public int solution(int[] order) {
        int answer = 0;
        
        Stack<Integer> save = new Stack<>();
        
        int idx = 0;
        for(int i = 1; i <= order.length; i++){
            if(order[idx] == i){
                answer++;
                idx++;
                while(!save.isEmpty() && save.peek() == order[idx]){
                    answer++;
                    idx++;
                    save.pop();
                }
            }else{
                save.push(i);
            }
        }
        while(!save.isEmpty() && save.peek() == order[idx]){
            answer++;
            idx++;
        }

        return answer;
    }
}