import java.util.*;
class Solution {
    static char ch;
    public int[] solution(String[] keymap, String[] targets) {
        int len = targets.length;
        int[] answer = new int[len];
        
        Map<Character, Integer> map = new HashMap();
        for(String key : keymap){
            for(int i = 0; i<key.length(); i++){
                char ch = key.charAt(i);
                
                int value = map.getOrDefault(ch,i+1);
                
                map.put(ch, Math.min(value, i+1));
            }
        }
        int index = 0;
        for(String tg : targets){
            for(int i = 0; i<tg.length(); i++){
                if(map.containsKey(tg.charAt(i))){
                    answer[index] += map.get(tg.charAt(i));
                }else{
                    answer[index] = -1;
                    break;
                }
            }
            index++;
        }
        
        
        
        return answer;
    }
}
            // for(int i = 0; i<targets.length; i++){
            //     for(int j = 0; j<targets[i].length(); j++){
            //         char ch = targets[i].charAt(j);
            //         if(map.containsKey(ch)){
            //             answer[i] += map.get(ch);
            //         }else{
            //             answer[i] = -1;
            //             break;
            //         }
            //     }                
            // }