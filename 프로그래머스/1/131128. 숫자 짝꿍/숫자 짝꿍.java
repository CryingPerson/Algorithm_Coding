import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        
        char[] ch = X.toCharArray();
        char[] ch2 = Y.toCharArray();

        int[] alpabet = new int[26];
        int[] alpabet2 = new int[26];
        for(char s1 : ch){
            alpabet[s1 - '0']++;
        }
        for(char s1 : ch2){
            alpabet2[s1 - '0']++;
        }
        int[] alpabet3 = new int[26];
        for(int i = 0; i < 26; i++){
            alpabet3[i] = Math.min(alpabet[i], alpabet2[i]);
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 25; i >=0; i--){
            if(alpabet3[i] != 0){
                int a = alpabet3[i];
                for(int j = 0; j < a; j++){
                    sb.append(i);
                }
            }
        }
        String s = sb.toString();
        if(s.equals("")) return "-1";
        if(s.length() >= 1 && s.charAt(0) == '0'){
            return "0";
        }
        return s;
    }
}