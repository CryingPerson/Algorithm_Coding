import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)  throws Exception{
        Scanner sc = new Scanner(System.in);

        while (true){
            String s = sc.nextLine();
            if(s.equals("end"))break;

            check(s);
        }
    }
    public static void check(String s){
        // aiueo
        // aa bb xx
        // ee, oo 가능
        if(!s.contains("a") && !s.contains("i") && !s.contains("o") && !s.contains("u") && !s.contains("e")){
            System.out.println("<" + s + ">" + " is not acceptable.");
            return;
        }
        int mounCount = 0;
        int zaumCount = 0;
        if(s.length() == 1){
            System.out.println("<" + s + ">" + " is acceptable.");
            return;
        }
        for(int i = 0; i < s.length()-1; i++){
            char c = s.charAt(i);
            if(mounCount == 3){
                System.out.println("<" + s + ">" + " is not acceptable.");
                return;
            }
            if(zaumCount == 3){
                System.out.println("<" + s + ">" + " is not acceptable.");
                return;
            }
            if(c == 'a' || c == 'i' || c == 'o' || c == 'u' || c == 'e'){
                mounCount++;
                zaumCount =0;
            }else{
                mounCount = 0;
                zaumCount++;
            }
            if(c == s.charAt(i+1) && (c != 'e' && s.charAt(i+1) != 'e') && (c != 'o' && s.charAt(i+1) != 'o')){
                System.out.println("<" + s + ">" + " is not acceptable.");
                return;
            }
        }
        char last = s.charAt(s.length()-1);
        if(last == 'a' || last == 'i' || last == 'o' || last == 'u' ||last == 'e'){
            mounCount++;
            if(mounCount == 3){
                System.out.println("<" + s + ">" + " is not acceptable.");
                return;
            }
        }else{
            zaumCount++;
            if(zaumCount == 3){
                System.out.println("<" + s + ">" + " is not acceptable.");
                return;
            }
        }
        System.out.println("<" + s + ">" + " is acceptable.");
    }
}