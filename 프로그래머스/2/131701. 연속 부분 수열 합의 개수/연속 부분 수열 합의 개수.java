import java.util.*;
class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        
        Set<Integer> set = new HashSet();
        
        for(int i = 0; i < elements.length; i++){
            int count = i + 1;
            for(int j = 0; j < elements.length; j++){
                int sum = 0;
                for(int k = j; k < j + count; k++){
                    sum += elements[k % elements.length];
                }
                set.add(sum);
            }
        }
        return set.size();
    }
}