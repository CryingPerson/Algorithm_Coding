class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        
        int size = brown + yellow;
        
        for(int i = 1; i <= brown; i++){
            if(size % i == 0){
                         int h = size / i;
            if(i < h) continue;
            
            if((i - 2) * (h - 2) == yellow){
                return new int[]{i, h};
            }   
            }
            
        }
        return answer;
    }
}