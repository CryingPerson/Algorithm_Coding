import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        
        List<String> list = new ArrayList();
        list.add(words[0]);
        for(int i = 1; i<words.length; i++){
            if(list.contains(words[i]) || same(list.get(i-1), words[i])){
                answer[0] = i%n+1;
                answer[1] = i/n+1;
                break;
            }
            list.add(words[i]);
        }

        return answer;
    }
    public static boolean same(String s, String s2){
        char ch = s.charAt(s.length()-1);
        char cs = s2.charAt(0);
        
        if(ch == cs) return false;
        
        return true;
    }
}