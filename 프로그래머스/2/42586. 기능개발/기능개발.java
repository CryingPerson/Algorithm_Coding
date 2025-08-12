import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = new int[progresses.length];
     
        int idx = 0;
        int n = progresses.length;
        List<Integer> list = new ArrayList();
        while(idx < n){
            for(int i = idx; i < progresses.length; i++){
                progresses[i] += speeds[i];
            }
            
            int cnt = 0;
            
            while(idx < n && progresses[idx] >= 100){
                cnt++;
                idx++;
            }
            
            if(cnt != 0){
                list.add(cnt);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    } 
}