import java.util.*;
class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        
        Queue<Integer> q = new LinkedList();
        int[] visited = new int[n];
        for(int i = 0; i<n; i++){
            if(visited[i] == 1) continue;
            q.add(i);
            answer++;
            while(!q.isEmpty()){
                int poll = q.poll();
                for(int j = 0; j<computers[i].length; j++){
                    if(computers[poll][j] == 1 && visited[j] == 0){
                        q.add(j);
                        visited[j] = 1;
                    }
                }
            }
        }
        
        return answer;
    }
}