import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
    
        for(int i = 0; i < targets.length; i++){
            int a = 0;
   
            for(int j = 0; j < targets[i].length(); j++){
                char ch =  targets[i].charAt(j);
                    int max = Integer.MAX_VALUE;
                for(int k = 0; k < keymap.length; k++){
                    int se = keymap[k].length() + 1;
                    
                    for(int q = 0; q < keymap[k].length(); q++){
                        if(ch == keymap[k].charAt(q)){
                            max = Math.min(max, q+1);
                            se = q + 1;
                            break;
                        }
                    }
                }
                if (max == Integer.MAX_VALUE){
                  a = -1;
                    break;
                } 
                a += max;
                
            }
           answer[i] = a;
        }
        return answer;
    }
}