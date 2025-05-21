import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};
        
        HashMap<String, Integer> save = new HashMap();
        int num = 0;
        for(String player : players){
            save.put(player, num);
            num++;
        }
        for(String player : callings){
            int front = save.get(player) -1;
            String sese = players[front];
            players[front] = player;
            players[front + 1] = sese;
            
            save.put(player, save.get(player)-1);
            save.put(sese, save.get(sese)+1);
            }
      
        return players;
    }
}