import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        
        
        for(int i = 0; i <= discount.length - 10; i++){
            HashMap<String, Integer> map = new HashMap();
            for(int j = i; j < i + 10; j++){
                map.put(discount[j], map.getOrDefault(discount[j], 0) +1);
            }
            boolean ang = false;
            for(int j = 0; j < number.length; j++){
                if(!map.containsKey(want[j])){
                    ang = true;
                    break;
                }
                if( map.get(want[j]) != number[j]){
                    ang = true;
                 break;   
                }
            }
            if(!ang)answer++;
            
        }
        return answer;
    }
}