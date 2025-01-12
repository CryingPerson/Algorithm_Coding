import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        char[] ch = {'R','T','C','F','J','M','A','N'};
        StringBuilder sb = new StringBuilder();
        HashMap<Character, Integer> map = new HashMap();
        for(int i = 0; i<ch.length; i++){
            map.put(ch[i], 0);
        }
        
        for(int i = 0; i<survey.length; i++){
            char left = survey[i].charAt(0);
            char right = survey[i].charAt(1);
            
            if(choices[i] == 4)continue;
            
            if(choices[i] < 4){
                map.put(left, map.get(left) + 4 - choices[i]);
            }else{
                map.put(right, map.get(right) + choices[i] - 4);
            }
        }
        for(int i = 0; i<ch.length; i = i+2){
            char left = ch[i];
            char right = ch[i+1];
            
            if(map.get(left) >= map.get(right)){
                sb.append(left);
            }else{
                sb.append(right);
            }
        }
        return sb.toString();
    }
}