import com.sun.jdi.Value;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        LinkedList<Character> list = new LinkedList<>();
        String s = br.readLine();
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<s.length(); i++)
        {
            list.add(s.charAt(i));
        }
        ListIterator<Character> iterator = list.listIterator();
        while (iterator.hasNext())
        {
            iterator.next();
        }
        for(int i = 0; i<N; i++)
        {
            String command = br.readLine();
            char c = command.charAt(0);
            switch (c)
            {
                case 'L':
                    if(iterator.hasPrevious())
                    {
                        iterator.previous();
                    }
                    break;
                case 'D':
                    if(iterator.hasNext())
                    {
                        iterator.next();
                    }
                    break;
                case 'P':
                    char a = command.charAt(2);
                    iterator.add(a);
                    break;
                case 'B':
                    if(iterator.hasPrevious())
                    {
                        iterator.previous();
                        iterator.remove();
                    }
                    break;
                default:
                    break;
            }
        }
        for(char ch : list)
        {
            sb.append(ch);
        }
        System.out.println(sb);
    }
}