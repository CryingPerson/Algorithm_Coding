import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        
        Queue<Integer> q = new LinkedList();
        List<Integer> li = new ArrayList();
        for(int i = 0; i < progresses.length; i++){
            int days = 100 - progresses[i];
            
            int time = (int)Math.ceil((double)days / speeds[i]);
            q.add(time);
        }
        
        while(!q.isEmpty()){
            int cnt = 1;
            int cur = q.poll();
            while(!q.isEmpty() && q.peek() <= cur){
                q.poll();
                cnt++;
            }
            li.add(cnt);
        }
        return li.stream().mapToInt(i -> i).toArray();
    }
}