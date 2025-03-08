import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static char[] ch;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        for(int i = 0; i < s.length(); i = i + 10){
            System.out.println(s.substring(i, Math.min(i + 10, s.length())));
        }
        
    }
}