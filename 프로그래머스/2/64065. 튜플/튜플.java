import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        s = s.substring(2, s.length()-2);
        String[] st = s.split("},\\{");
        System.out.println(st[0]);
        Arrays.sort(st, Comparator.comparingInt(String::length));
        
        Set<String> list = new HashSet();
        List<Integer> list2 = new LinkedList();
        for(String word : st){
            String[] aaasss = word.split(",");
            for(String word2 : aaasss){
                if(list.contains(word2)) continue;
                else{
                    list.add(word2);
                    list2.add(Integer.parseInt(word2));
                }
            }

            
        }
        return list2.stream().mapToInt(i -> i).toArray();
    }
}