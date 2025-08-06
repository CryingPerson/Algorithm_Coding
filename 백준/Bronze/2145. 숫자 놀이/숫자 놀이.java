import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String num = sc.nextLine();

            if(num.equals("0")) break;



            while (num.length() > 1){
                int total = 0;
                for (int i = 0; i < num.length(); i++) {
                    total += Integer.parseInt(String.valueOf(num.charAt(i)));
                }
                num = String.valueOf(total);
            }
            System.out.println(num);
        }
    }
}
