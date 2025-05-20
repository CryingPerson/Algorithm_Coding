import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        
        Queue<String> save = new LinkedList();
        String city2 = "";
        for(String city : cities){
            city2 = city.toLowerCase();
            if(save.contains(city2)){

                    save.remove(city2);
                    save.add(city2);
                    answer++;

            }else{
                if(cacheSize == 0){
                    answer += 5;
                }else{
                    if(save.size() == cacheSize){
                        save.poll();  
                        save.add(city2);
                    }else{
                        save.add(city2);
                    }
                    answer += 5;
                }
            }
        }
        return answer;
    }
}