import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String s= sc.nextLine();

        if(s.length() == 1){
            System.out.println("NO");
            return;
        }

        for(int i = 1; i < s.length(); i++){
            String s1 = s.substring(i);
            String s2 = s.substring(0, i);


            if(compare(s1, s2)){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
    static boolean compare(String s1, String s2) {
        int sum1 = 1; int sum2 = 1;

        for(char c : s1.toCharArray()){
            sum1 *= Integer.parseInt(String.valueOf(c));
        }
        for(char c : s2.toCharArray()){
            sum2 *= Integer.parseInt(String.valueOf(c));
        }
        return sum1 == sum2;
    }
}
