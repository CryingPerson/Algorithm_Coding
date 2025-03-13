import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static char[] ch;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);


        while (sc.hasNextLine()){
            String s = sc.nextLine();
            if(s.equals("")) break;

            check(s);
        }

    }
    public static void check(String s) {
        int so = 0;
        int de = 0;
        int num = 0;
        int emty = 0;
        for(char c : s.toCharArray()){
            if(Character.isUpperCase(c)) de++;
            else if(Character.isLowerCase(c)) so++;
            else if(Character.isDigit(c)) num++;
            else emty++;
        }
        System.out.println(so + " " + de + " " + num + " " + emty);
    }
}