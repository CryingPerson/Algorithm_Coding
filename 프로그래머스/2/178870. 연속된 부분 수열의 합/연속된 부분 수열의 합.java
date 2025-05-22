class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer;
        
        int left = 0;
        int right = 0;
        int sum = 0;
        int maxLen =  Integer.MAX_VALUE;
        answer = new int[2];
        for( right = 0; right < sequence.length; right++){
            sum += sequence[right];
            
            while(sum > k){
                sum -= sequence[left++];
            }
            
            if(sum == k){
                if(right - left < maxLen){
                    maxLen = right - left;
                     answer[0] = left;
                     answer[1] = right;
                }
            }
        }
        return answer;
    }
}