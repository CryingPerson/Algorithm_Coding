import java.util.*;
class Solution {
    static int cnt = 0;
    static boolean[] checked;
    static Set<Integer> set;
    public int solution(String numbers) {
        int answer = 0;
        set = new HashSet();
        checked = new boolean[numbers.length()];
        DFS(numbers,"");
        return set.size();
    }
    static void DFS(String numbers,String word){
        if(!word.equals("") && check(Integer.parseInt(word))) set.add(Integer.parseInt(word));
        for(int i = 0; i < numbers.length(); i++){
            if(!checked[i]){
                checked[i] = true;
             DFS(numbers, word + numbers.charAt(i));   
                checked[i] = false;
            }
        }
    }
    static boolean check(int n){
        if(n <= 1) return false;
        
        if(n == 2) return true;
        
        for(int i = 2; i*i <= n; i++)
            if(n % i == 0) {
                return false;
            }
        return true;
    }
}