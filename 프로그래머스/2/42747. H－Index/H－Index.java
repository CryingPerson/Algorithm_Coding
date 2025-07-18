class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        
        int max = -1;
        
        for(int i = 0; i <= citations.length; i++){
            int cnt = 0;
            int cnt2 = 0;
            for(int j = 0; j < citations.length; j++){
                if(citations[j] >= i){
                    cnt++;   
                }else if(citations[j] <= i){
                    cnt2++;
                }
            }   
            if(i <= cnt && i >= cnt2) max = i;
        }
        return max;
    }
}