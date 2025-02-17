import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        HashMap<String, HashMap<String, Integer>> map = new HashMap();
        HashMap<String, Integer> ma = new HashMap();
        for(int i = 0; i<id_list.length; i++){
        
            String name = id_list[i];
            map.put(name, new HashMap());
            ma.put(name,i);
        }
        for(String s : report){
            String[] st = s.split(" ");
            String reports = st[0];
            String reporteds = st[1];
            
            map.get(reporteds).put(reports,1);
        }
        
        for(int i = 0; i<id_list.length; i++){
            String repoted = id_list[i];
            HashMap<String, Integer> maps = map.get(repoted);
            if(maps.size() >= k){
                for(String se : maps.keySet()){
                    answer[ma.get(se)]++;
                }
            }
        }
        return answer;
    }
}