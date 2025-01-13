class Solution {
    public String solution(String s) {
        String answer = "";
        String so = s.toLowerCase();
        String[] st = so.split(" ");
        for(String ss : st){
            if(ss.length() == 0){
                answer += " ";
            }
            else {
                answer += Character.toUpperCase(ss.charAt(0));
                answer += ss.substring(1, ss.length());
                answer += " ";
            }
        }
        if(s.substring(s.length()-1, s.length()).equals(" ")){
            return answer;
        }
        return answer.substring(0, answer.length()-1);
    }
}