package test.com;

import java.util.*;

public class Test {
    public static void main(String[] args) {

        String x = "144500";
        char[] charArray = x.toCharArray();
        System.out.println(charArray.length);
        String y = "445";

        System.out.println(Solution.solution("}]()[{"));
    }
}
class Solution {
    public static int solution(String s) {
        int answer = 0;

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(0);
            if(check(s)){
                answer++;
            }
            s = s.substring(1,s.length()) + ch;
        }
        return answer;
    }
    public static boolean check(String word){
        Stack<Character> stack = new Stack();
        int a = 0; int b = 0; int c = 0;
        for(int i = 0; i<word.length(); i++){
            char wd = word.charAt(i);

            if(stack.isEmpty() && (wd ==']' || wd =='}' || wd ==')')) return false;
            if(wd == '('){
                stack.push(wd);
                a++;
            }else if(wd == '{'){
                stack.push(wd);
                b++;
            }else if(wd == '['){
                stack.push(wd);
                c++;
            }else if(wd == ')' && stack.peek() == '('){
                stack.pop();
                a--;
            }else if(wd ==']' && stack.peek() == '['){
                stack.pop();
                c--;
            }else if(wd == '}' && stack.peek() == '{'){
                stack.pop();
                b--;
            }

        }
        if(a == 0 && b == 0 && c == 0) return true;
        return false;
    }
}
