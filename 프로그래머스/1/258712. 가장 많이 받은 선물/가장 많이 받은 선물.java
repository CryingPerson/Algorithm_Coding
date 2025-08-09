import java.util.*;
class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        
        Map<String, Map<String, Integer>> map = new HashMap();
        Map<String, Integer> giftPoint = new HashMap();
        for(String gift : gifts){
            String[] pre = gift.split(" ");
            String from = pre[0];
            String to = pre[1];
            
            if(!map.containsKey(from)){
                map.put(from, new HashMap());
            }
            map.get(from).put(to, map.get(from).getOrDefault(to, 0) + 1);      
            
            giftPoint.put(from, giftPoint.getOrDefault(from, 0 ) + 1);
            giftPoint.put(to, giftPoint.getOrDefault(to, 0 ) - 1);
        }
        
        for(String fri : friends){
            if(!map.containsKey(fri)){
                map.put(fri, new HashMap());
            }
            if(!giftPoint.containsKey(fri)) giftPoint.put(fri, 0);
        }
        
        int[] arr = new int[friends.length];
        for(int i = 0; i < friends.length; i++){
            String fr = friends[i];
            for(int j = i+1; j < friends.length; j++){
                String t = friends[j];
                
                int a1 = map.get(fr).getOrDefault(t, 0);
                int a2 = map.get(t).getOrDefault(fr, 0);
                
                if(a1 > a2){
                    arr[i]++;
                }else if(a1 < a2){
                    arr[j]++;
                }else{
                    int num1 = giftPoint.get(fr);
                    int num2 = giftPoint.get(t);
                    if(num1 > num2){
                        arr[i]++;
                    }else if(num1 < num2){
                        arr[j]++;
                    }
                }
            }
        }
        int qwe = Arrays.stream(arr).max().getAsInt();
        
        return (qwe != 0) ? qwe : 0;
    }
}