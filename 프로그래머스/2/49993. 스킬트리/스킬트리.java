import java.util.*;
class Solution {
    public int solution(String skill, String[] skill_trees) {
        Queue<Character> st = new LinkedList();
        for(char c : skill.toCharArray()) st.add(c);
        int answer = 0;
        for(int i = 0; i<skill_trees.length; i++){
            boolean flag = true;
            for(char c : skill_trees[i].toCharArray()){
                if(st.contains(c)){
                    char ch = st.poll();
                    if(ch != c) {
                        flag = false;
                        break;
                    }
                }
            }
            if(flag) answer++;
            st.clear();
            for(char c : skill.toCharArray()) st.add(c);
        }
        return answer;
    }
}