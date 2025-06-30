import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        HashMap<Integer, Integer> save = new HashMap();
        for(int x : tangerine){
            save.put(x, save.getOrDefault(x , 0) + 1);
        }
        List<Integer> list = new ArrayList();
        for(int val : save.values()){
            list.add(val);
        }
        Collections.sort(list, Collections.reverseOrder());
        
        for(int num : list){
            if(k > num){
                k -= num;
                answer++;
            }else{
                answer++;
                break;
            }
        }
        return answer;
    }
}