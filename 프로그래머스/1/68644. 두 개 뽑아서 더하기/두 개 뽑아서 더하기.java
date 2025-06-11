import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        
                    int sum = 0;
        Set<Integer> set = new HashSet();
        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers.length; j++){
                if(i == j) continue;
                set.add(numbers[i] + numbers[j]);
            }
        }
        List<Integer> list = new ArrayList();
        for(int n : set){
            list.add(n);
        }
        Collections.sort(list);
        int [] st = list.stream().mapToInt(i -> i).toArray();
        return st;
    }
}