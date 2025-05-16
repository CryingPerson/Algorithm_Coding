import java.util.*;

public class Solution {
    public String solution(String s) {
        int[] answer = new int[2];
        
        List<Integer> list = new ArrayList();
        
        String[] cs = s.split(" ");
        for(String word : cs) list.add(Integer.parseInt(word));
        
        Collections.sort(list);
        
        String ans = "";
        ans += list.get(0) + " ";
        ans += list.get(list.size()-1);
        
        return ans;
    }
}