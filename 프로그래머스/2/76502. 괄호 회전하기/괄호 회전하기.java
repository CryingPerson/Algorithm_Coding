import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        
        for(int i = 0; i < s.length(); i++){
            String ss ="";
            ss += s.substring(i);
            ss += s.substring(0, i);
            // [(]) (])[  ])[( 
            
            if(check(ss)) answer++;
        }
        return answer;
    }
    static boolean check(String word){
        Stack<Character> stack = new Stack();
        
        for(char ch : word.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }else{
                if(stack.isEmpty()) return false;
                
                char top = stack.pop();
                
                if(ch == ']' && top != '[') return false;
                 if(ch == '}' && top != '{') return false;
                 if(ch == ')' && top != '(') return false;
            }
        }
        return stack.isEmpty() ? true : false;
    }
}