class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] st = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for(int i = 0; i<st.length; i++){
          s =  s.replace(st[i], String.valueOf(i));
        }
        return Integer.parseInt(s);
    }
}