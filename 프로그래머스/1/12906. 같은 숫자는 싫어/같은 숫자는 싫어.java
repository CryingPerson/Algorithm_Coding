import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        
        boolean flag = false;
        Set<Integer> set = new HashSet();
        List<Integer> list = new LinkedList();
        int first = -123135;
        for(int x : arr){
            if(first != x) {
                flag = true;
            }
            if(flag){
                list.add(x);
                flag = false;
            }
            first = x;
        }
        

        return list.stream().mapToInt(i -> i).toArray();
    }
}