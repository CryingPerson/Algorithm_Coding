import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        HashMap<Integer, Integer> map = new HashMap();
        
        for(int x : tangerine){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        List<Integer> list = new ArrayList(map.values());
        Collections.sort(list, Collections.reverseOrder());
        
        int sum = 0;
        for(int i = 0; i<list.size(); i++){
            sum += list.get(i);
            answer++;
            if(sum >= k){
                break;
            }
        }
        return answer;
    }
}