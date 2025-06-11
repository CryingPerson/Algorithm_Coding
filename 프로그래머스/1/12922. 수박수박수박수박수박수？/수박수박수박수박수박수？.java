class Solution {
    public String solution(int n) {
        String answer = "";
        
        int len = n / 2;
        int have = n % 2;
        
        for(int i = 0; i < len; i++){
            answer += "수박";
        }
        for(int i = 0; i < have; i++){
            answer += "수";
        }
        return answer;
    }
}