import java.util.*;
class Solution {
    static boolean[] chek;
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        chek = new boolean[words.length];
        answer = BFS(begin, target, words);
        return answer;
    }
    static int BFS(String begin, String target, String[] words){
        Queue<String> qu = new LinkedList();
        
        qu.add(begin);
        int L = 0;
        while(!qu.isEmpty()){
            int len = qu.size();
            for(int i = 0; i < len; i++){
                String s = qu.poll();
                if(s.equals(target)) return L;
                
                for(int j = 0; j < words.length; j++){
                    if(get(s, words[j]) && !chek[j]){
                        chek[j] = true;
                        qu.add(words[j]);
                    }
                }
            }
            L++;
        }
        return 0;
    }
    static boolean get(String s, String s2){
        int len = s.length();
        int cnt = 0;
        for(int i = 0; i <s.length(); i++){
            if(s.charAt(i) == s2.charAt(i)) cnt++;
        }
        if(cnt == len - 1) return true;
        return false;
    }
}