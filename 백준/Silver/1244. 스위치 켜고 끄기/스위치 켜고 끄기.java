import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N;
    static int[] ans;
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
         N = sc.nextInt();

         ans = new int[N+1];
        for(int i = 1; i <= N; i++){
            int sw = sc.nextInt();
            ans[i] = sw;
        }
        int cnt = sc.nextInt();
        for(int i = 0; i < cnt; i++){
            int sex = sc.nextInt();
            int num = sc.nextInt();

            if(sex == 1){
                change(num);
            }else{
                if(ans[num] == 1){
                    ans[num] = 0;
                }else ans[num] = 1;
                girlSex(num);
            }
        }
        int count = 0;
        for (int i = 1; i <= N; i++) {
            count++;
            System.out.print(ans[i] + " ");
            if(count == 20){
                System.out.println();
                count = 0;
            }
        }
    }
    public static void change(int number){
        for (int i = number; i <= N; i += number) {
            ans[i] = 1 - ans[i];
        }
    }
    public static void girlSex(int number){
        int a = 1;
        while (number - a > 0 && ans.length > number + a && ans[number-a] == ans[number+a] ){
            if(ans[number-a] == 1){
                ans[number-a] = 0;
                ans[number+a] = 0;
            }
            else {
                ans[number-a] = 1;
                ans[number+a] = 1;
            }
            a++;
        }
    }
}
