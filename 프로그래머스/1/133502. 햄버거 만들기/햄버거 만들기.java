import java.util.*;
class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        
        Stack<Integer> stack = new Stack();
        
        for(int x : ingredient){
            stack.push(x);
            
            if(stack.size() >= 4){
                int num = stack.size();
                if(stack.get(num - 4) == 1 &&
                  stack.get(num - 3) == 2 &&
                  stack.get(num - 2) == 3 &&
                  stack.get(num - 1) == 1){
                    answer++;
            for(int i = 0; i < 4; i++) stack.pop();
                }
            
            }
        }
        return answer;
    }
}