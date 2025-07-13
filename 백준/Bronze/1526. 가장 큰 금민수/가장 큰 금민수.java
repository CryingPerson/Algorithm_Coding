import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = n; i >= 0; i--) {
            if(check(i)){
                System.out.println(i);
                return;
            }
        }
    }
    static boolean check(int n){
        String s = String.valueOf(n);
        for(char c : s.toCharArray()){
            char ch = (char) (c - '0');

            if(ch == 4 || ch == 7){

            }else{
                return false;
            }
        }
        return true;
    }
}
