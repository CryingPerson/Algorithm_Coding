import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        Map<String, Integer> save = new HashMap();
        
        int idx = 0;
        for(String food : want) save.put(food, number[idx++]);
        
        for(int i = 0; i <= discount.length - 10; i++){
            Map<String, Integer> save2 = new HashMap();
            boolean flag = true;
            for(int j = i; j < i + 10; j++){
                save2.put(discount[j], save2.getOrDefault(discount[j], 0) + 1);
            }
            
            for(String val : save.keySet()){
                if(save.get(val) != save2.get(val)){
                    flag = false;
                }
            }
            if(flag) answer++;
        }
        return answer;
    }
}