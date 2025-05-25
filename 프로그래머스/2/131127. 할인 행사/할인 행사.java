import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        Map<String, Integer> food = new HashMap();
        for(int i = 0; i < want.length; i++){
            food.put(want[i], number[i]);
        }
        for(int i = 0; i < discount.length; i++){
            HashMap<String, Integer> map = new HashMap();
            
            for(int j = i; j < i + 10 && i + 10 <= discount.length; j++){
                map.put(discount[j], map.getOrDefault(discount[j], 0) + 1);
            }
            
            boolean flag = true;
            
            for(String foods : food.keySet()){
                if(food.get(foods) != map.get(foods)) flag = false;
            }
            
            if(flag) answer++;
        }
        
        
        return answer;
    }
}