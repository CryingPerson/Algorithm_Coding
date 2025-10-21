import java.util.*;
class Solution {
    static Set<Integer> list;
    static boolean[] turn;
    public int solution(int[] cards) {
        int answer = 0;
        
    
        
        
        
        for(int i = 0; i < cards.length; i++){
            int num = cards[i] - 1;
            list = new HashSet();
            turn = new boolean[cards.length];
            
            int firstgroup = dfs(i, cards);
            int maxx = 0;
            for(int j = 0; j < cards.length; j++){
                if(!turn[j]){
                    int second = dfs(j, cards);
                    maxx = Math.max(maxx, second);
                }
            }
            
            answer = Math.max(answer, firstgroup * maxx);
        }
        return answer;
    }
    static int dfs(int start, int[] cards){
        if(turn[start]) return 0;
        turn[start] = true;
        
        return 1 + dfs(cards[start] - 1, cards);
    }
}