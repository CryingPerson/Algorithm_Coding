import com.sun.jdi.Value;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int[]arr = new int[10];
        int max = -1;
        for(int i = 0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch == '9')
            {
                arr['6'-48]++;
            }
            else
            {
                arr[ch-48]++;
            }
        }
        if(arr[6] % 2 == 1) {
            arr[6] = arr[6] / 2 + 1;
        }else {
            arr[6] = arr[6] / 2;
        }
        for(int i = 0; i<10; i++)
        {
            max = Math.max(max,arr[i]);
        }
        System.out.println(max);
    }
}