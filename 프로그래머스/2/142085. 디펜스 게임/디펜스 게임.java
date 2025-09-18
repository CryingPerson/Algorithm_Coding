import java.util.*;
class Solution {
    public int solution(int n, int k, int[] enemy) {
        int answer = 0;
        
        PriorityQueue<Integer> p = new PriorityQueue<Integer>(Collections.reverseOrder());
        
        for(int i = 0; i < enemy.length; i++){
            p.add(enemy[i]);
            n -= enemy[i];
            if(k > 0 && n < 0){
                k--;
                n += p.poll();
            }
                        if(n < 0) return i;
        }
        
        return enemy.length;
    }
}