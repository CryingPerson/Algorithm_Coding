import java.util.*;
class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        
        int[] visit = new int[n];
        Queue<Integer> q = new LinkedList();
        for(int i = 0; i<n; i++){
            if(visit[i] == 1) continue;
            answer++;
            q.add(i);
            while(!q.isEmpty()){
                int pol = q.poll();
                if(visit[pol] == 1) continue;
                for(int j = 0; j<computers[i].length; j++){
                    if(computers[pol][j] == 1){
                        q.add(j);
                        visit[pol] = 1;
                    }
                }
            }

        }
        return answer;
    }
}