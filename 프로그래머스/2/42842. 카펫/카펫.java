class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        
        int sum = brown + yellow;
        
        int sero = 0;
        int garo = 0;
        
        for(int i = 1; i <= sum; i++){
            if(sum % i == 0){
                sero = sum / i;
                
                if(sero <= i){
                    if((i - 2) * (sero -2) == yellow){
                        return new int[]{i, sero};
                    }
                }
            }
        }
        return answer;
    }
}