import java.util.*;
class Solution {
    static Set<String> set = new HashSet();
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];

        String first = words[0];
        for(int i = 1; i < words.length; i++){
            set.add(first);
            if(check(first, words[i])){
                set.add(first);
                int place = i % n + 1;
                int place2 = i / n + 1;   
                
                answer[0] = place;
                answer[1] = place2;
                return answer;
            }
            first = words[i];
        }
        answer[0] = 0;
        answer[1] = 0;
        return answer;
    }
    static boolean check(String s, String s2){
        if(s.charAt(s.length() - 1) != s2.charAt(0)) return true;
        if(set.contains(s2)) return true;
        
        return false;
    }
}