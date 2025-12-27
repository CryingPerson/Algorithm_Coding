import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        Stack<Character> stack = new Stack<>();
        int sum = 0;
        int mul = 1;
        for(int i =0; i<s.length(); i++)
        {
            char c = s.charAt(i);

            if(c == '(')
            {
                stack.push(c);
                mul *= 2;
            }
            else if(c == '[')
            {
                stack.push(c);
                mul *= 3;
            }
            else
            {
                if(c == ')')
                {
                    if(stack.isEmpty() || stack.peek() != '(')
                    {
                        sum = 0;
                        break;
                    }
                    if(s.charAt(i-1) == '(')
                    {
                        sum += mul;
                    }
                    stack.pop();
                    mul /= 2;
                }
                else if(c == ']')
                {
                    if(stack.isEmpty() || stack.peek() != '[')
                    {
                        sum = 0;
                        break;
                    }
                    if(s.charAt(i-1) == '[')
                    {
                        sum += mul;
                    }
                    stack.pop();
                    mul /= 3;
                }
            }
        }
        if(!stack.isEmpty())
        {
            System.out.println(0);
        }
        else {
            System.out.println(sum);
        }
    }

}