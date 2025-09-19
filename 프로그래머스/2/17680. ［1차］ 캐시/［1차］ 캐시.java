import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        
        int len = cities.length;
        Queue<String> qu = new LinkedList();
        if(cacheSize == 0){
            return cities.length * 5;
        }
        for(int i = 0; i < len; i++){
            String word = cities[i].toLowerCase();
            if(qu.contains(word)){
                answer++;
                qu.remove(word);
                qu.add(word);
            }else{
                if(qu.size() < cacheSize){
                    qu.add(word);
                    answer += 5;   
                }else{
                    qu.poll();
                    qu.add(word);
                    answer += 5;
                }
            }
        }
        return answer;
    }
}