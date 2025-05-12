class Solution {
    public int solution(String s) {
        int answer = 0;
        
        int a = 0;
        int b = 0;
        char pre = s.charAt(0);
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == pre){
                a++;
            }else{
                b++;
            }
            if(a == b){
                answer++;
                
                               if (i + 1 < s.length()) {
                    pre = s.charAt(i + 1);
                }

                a = 0;
                b = 0;
            }
        }
        if(a != 0 || b != 0) answer++;
        return answer;
    }
}