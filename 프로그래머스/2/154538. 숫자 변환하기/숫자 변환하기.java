import java.util.*;
class Solution {
    static boolean[] visited;
    public int solution(int x, int y, int n) {
        int answer = 0;
    visited = new boolean[y+1];    
        int ans = BFS(x,y,n);
    
        return ans;
    }
    static int BFS(int x, int y, int n){
        Queue<Integer> qu = new LinkedList();
        qu.add(x);
        int L = 0;
        while(!qu.isEmpty()){
            int si = qu.size();
            
            for(int i = 0; i < si; i++){
                int num = qu.poll();
                if(num == y) return L;
                
                int[] arry = {num + n, num * 2, num * 3};
                for(int val : arry){
                    if(y >= val && !visited[val]){
                        visited[val] = true;
                        qu.add(val);
                    }
                }
            }
            L++;
        }
        return -1;
    }
}