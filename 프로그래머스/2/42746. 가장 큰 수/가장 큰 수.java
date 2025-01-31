import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] ans = new String[numbers.length];
        for(int i = 0; i<numbers.length; i++){
            ans[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(ans, (o1, o2) -> (o2+o1).compareTo(o1+o2));
        StringBuilder sb = new StringBuilder();
        for(String s : ans) sb.append(s);
        
        String anss = sb.toString();
        
        return anss.charAt(0) == '0' ? "0" : anss;
    }
}
