class Solution {
    public int solution(int n, int w, int num) {
        int answer = 0;
        
        int curHeigh = (num - 1) / w;
         int maxH = (n - 1) / w;
        
        int curW = 0;
        if(curHeigh % 2 != 0){
            curW = w - 1 - (num - 1) % w;
        }else{
            curW = (num - 1) % w;
        }
       
        for(int i = curHeigh; i<= maxH; i++){
            if(i % 2 != 0){
                if((i+1) * w - curW - 1 < n){
                    answer++;
                }
            }else{
                if((i * w) + curW < n){
                    answer++;
                }
            }
        }
        return answer;
    }
}