import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = {};
        Map<Integer, Double> map = new HashMap();
        for(int i = 1; i<=N; i++){
            int a = 0;
            int b = 0;
            for(int j = 0; j<stages.length; j++){
                if(stages[j] == i) a++;
                if(stages[j] >= i) b++;
            }
            if(a == 0 && b == 0){
                map.put(i,0.0);
            }else{
             map.put(i, (double)a/b);   
            }
        }
        List<Integer> list = new ArrayList(map.keySet());
        list.sort((o1,o2) -> map.get(o2).compareTo(map.get(o1)));
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}