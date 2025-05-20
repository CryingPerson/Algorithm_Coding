class Solution {
    public static char[] ws ={'A', 'E', 'I', 'O', 'U'}; 
    static int ans = 0;
    static int cnt = 0;
    public int solution(String word) {
        int answer = 0;
        
        DFS("", word);
        return ans;
    }
    public static void DFS(String wrd, String target){
        if(wrd.equals(target)){
            ans = cnt;
            return;
        }
        if(wrd.length() >= 5){
            return;
        }
        System.out.println(wrd);
        for(int i = 0; i <ws.length; i++){
            if(ans != 0) return;
            cnt++;
            DFS(wrd + ws[i], target);
        }
    }
}