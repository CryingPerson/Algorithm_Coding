class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int sum = brown + yellow;
        
        for(int i = 1; i <= sum; i++){
            int hight = sum / i;
            
            if(i < hight) continue;
            
            if((i - 2) * (hight - 2) == yellow){
                answer[0] = i;
                answer[1] = hight;
            }
        }
        return answer;
    }
}