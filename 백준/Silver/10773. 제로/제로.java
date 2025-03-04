import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer>stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++)
        {
            int a = Integer.parseInt(br.readLine());
            if(a != 0)
            {
                stack.push(a);
            }
            else
            {
                stack.pop();
            }
        }
        int sum = 0;
        for(int num : stack)
        {
            sum +=num;
        }
        System.out.println(sum);
    }
}