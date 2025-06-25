import java.util.*;
class Solution {
    static  ArrayList<ArrayList<Integer>> list;
    static int count = 0;
    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;
        
        
        list = new ArrayList();
        for(int i = 0; i <= n; i++){
            list.add(new ArrayList());
        }
        for(int i = 0; i < wires.length; i++){
            int a = wires[i][0];
            int b = wires[i][1];
            list.get(a).add(b);
            list.get(b).add(a);
        }
        
        for(int i = 0; i < wires.length; i++){
            int a = wires[i][0];
            int b = wires[i][1];
            
                list.get(a).remove(Integer.valueOf(b));
                list.get(b).remove(Integer.valueOf(a));
            
            boolean[] visited = new boolean[n+1];
            count = 1;
            visited[a] = true;
            DFS(a, visited);
            int ans = n - count;
            int ans2 = Math.abs(ans - count);
            answer = Math.min(ans2, answer);
            
                list.get(a).add(b);
                list.get(b).add(a);
            
        }
    
        
        return answer;
    }
    static void DFS(int a, boolean[] viisted){
        for(int x : list.get(a)){
            if(!viisted[x]){
                viisted[x] = true;
                count++;
                DFS(x, viisted);
            }
        }
    }
}