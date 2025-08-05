import java.util.*;
class Solution {
    public static int solution(int cacheSize, String[] cities) {
        int answer = 0;

        HashMap<String, Integer> map = new HashMap();
        HashMap<String, Integer> time = new HashMap();
        int idx = 0;
        int usaaa = 300000;
        for(String city : cities){
            city = city.toLowerCase();
            if (cacheSize == 0) {
                answer += 5;
                continue;
            }
            if(map.size() != cacheSize){
                if(map.containsKey(city)){
                    time.put(city, usaaa++);
                    answer++;
                }else{
                    time.put(city, usaaa++);
                    answer += 5;
                }
                map.put(city, map.getOrDefault(map.get(city) , 0) + 1);
            }else{
                if(map.containsKey(city)){
                    map.put(city, map.getOrDefault(map.get(city) , 0) + 1);
                    time.put(city, usaaa++);
                    answer ++;
                }else{
                    int max = Integer.MAX_VALUE;
                    String name = "";
                    for(String cities2 : time.keySet()){
                        if(max > time.get(cities2)){
                            max = time.get(cities2);
                            name = cities2;
                        }
                    }
                    map.remove(name);
                    time.remove(name);
                    answer += 5;
                    map.put(city, 1);
                    time.put(city, usaaa++);
                }
            }
        }
        return answer;
    }
}

// 5 5 5 1 1 1 1 1 1
// 판교 서울 제주