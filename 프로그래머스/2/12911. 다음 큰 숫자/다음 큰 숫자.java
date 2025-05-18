class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String change = Integer.toBinaryString(n);
        for(char ch : change.toCharArray()){
            if(ch == '1') answer++;
        }
        int sum;
        int find = 0;
        while(true){
            sum = 0;
            n++;
                String see = Integer.toBinaryString(n);
                for(char ch : see.toCharArray()){
                    if(ch == '1') sum++;
                }
            if(sum == answer){
                find = n;
              break;  
            } 
        }
        return find;
    }
}