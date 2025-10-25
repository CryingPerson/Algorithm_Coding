class Solution {
    public int solution(int[] cards) {
        int answer = 0;
    
        for(int i = 0; i < cards.length; i++){
            boolean[] visited = new boolean[cards.length];
            int a = dfs(cards[i] - 1, visited, cards);
            
            for(int j = 0; j < cards.length; j++){
                if(!visited[j]){
                    int b = dfs(cards[j] - 1, visited, cards);
                    
                    answer = Math.max(answer, a * b);
                }
            }
        }
        return answer;
    }
    static int dfs(int num, boolean[] visited, int[] card){
        if(visited[num]){
            return 0;
        }
        visited[num] = true;
        return 1 + dfs(card[num] - 1, visited, card);
    }
}