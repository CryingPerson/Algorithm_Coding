import com.sun.jdi.Value;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Character> stack = new Stack<>();

        String s = br.readLine();
        int cnt = 0;
        for(int i = 0; i<s.length(); i++)
        {
            char ch = s.charAt(i);

            if(ch == '(')
            {
                stack.push(ch);
            }
            else
            {
                if(ch == ')')
                {
                    if(s.charAt(i-1) == '(')
                    {
                        stack.pop();
                        cnt += stack.size();
                    }
                    else
                    {
                        stack.pop();
                        cnt += 1;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}