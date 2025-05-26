import java.util.*;
class Solution {
    
    static boolean[] visited;
    public int solution(String numbers) {
        int answer = 0;
        HashSet<Integer> set = new HashSet();
        String blanck = "";
        visited = new boolean[numbers.length()];
        
        recusive(blanck, numbers, set);
        for(Integer nums : set){
            if(isPrime(nums)){
                answer++;
            }
        }
        
        return answer;
    }
   public boolean isPrime(int num) {
        if (num == 0 || num == 1) {
            return false;
        }
        
        int limit = (int) Math.sqrt(num);
        
        for (int i = 2; i <= limit; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        
        return true;
    }
    public void recusive(String blanck,String numbers, HashSet<Integer> set){
        if(!blanck.equals("")){
            set.add(Integer.parseInt(blanck));
        }
        
        for(int i = 0; i<numbers.length(); i++){
            if(!visited[i]){
                visited[i] = true; 
                recusive(blanck + numbers.charAt(i),numbers, set);
                visited[i] = false;
            }
        }
        
    }
}