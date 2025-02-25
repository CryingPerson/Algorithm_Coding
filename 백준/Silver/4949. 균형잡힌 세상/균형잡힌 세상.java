import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;

        while (true)
        {
            s = br.readLine();
            if(s.equals("."))
            {
                break;
            }
            else
            {
                System.out.println(check(s));
            }
        }
    }
    static String check(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++) {

            char a = s.charAt(i);
            if (a == '(' || a == '[')
            {
                stack.push(a);
            }
            else if(a == ')')
            {
                if(stack.isEmpty() || stack.peek() != '(')
                {
                    return "no";
                }
                else
                {
                    stack.pop();
                }
            }
            else if(a == ']')
            {
                if(stack.isEmpty() || stack.peek() != '[')
                {
                    return "no";
                }
                else
                {
                    stack.pop();
                }
            }
        }
        if(stack.isEmpty())
        {
            return "yes";
        }
        else return "no";
    }
}