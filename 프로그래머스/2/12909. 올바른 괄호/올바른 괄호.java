class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int sum = 0;
        for(char word : s.toCharArray()){
            if(sum < 0) return false;
            if(word == '('){
                 sum++;
            }else{
                sum--;
            }
        }
        if(sum != 0) return false;
        return true;
    }
}