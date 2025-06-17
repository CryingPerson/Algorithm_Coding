import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];

        List<String> list = new ArrayList();
        
        list.add(words[0]);
        for(int i = 1; i < words.length; i++){
            if(list.contains(words[i])){
                int a = i % n + 1;
                int b = i / n + 1;
                
                return new int[] {a,b};
            }
            if(same(words[i - 1], words[i])){
                int a = i % n + 1;
                int b = i / n + 1;
                
                return new int[] {a,b};
            }
            list.add(words[i]);
        }

        return answer;
    }
    static boolean same(String s, String s2){
        char ch = s.charAt(s.length() - 1);
        char cs = s2.charAt(0);
        
        if(ch == cs) return false;
        
        return true;
    }
}