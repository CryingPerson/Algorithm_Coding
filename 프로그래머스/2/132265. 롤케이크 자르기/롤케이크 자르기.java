import java.util.*;
class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        
        Map<Integer, Integer> left = new HashMap();
        Map<Integer, Integer> right = new HashMap();
        
        for(int resource : topping) left.put(resource, left.getOrDefault(resource, 0) + 1);
        
        for(int i = 0; i < topping.length; i++){
            int val = topping[i];
            
            right.put(val, right.getOrDefault(val, 0) + 1);
            
            left.put(val , left.get(val) - 1);
            if(left.get(val) == 0){
                left.remove(val);
            }
            if(right.size() == left.size()) answer++;
        }
        return answer;
    }
}