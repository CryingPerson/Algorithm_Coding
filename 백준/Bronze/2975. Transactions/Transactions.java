import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static int[]arr;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int have = sc.nextInt(); String cmd = sc.next();
            int num = sc.nextInt();

            if(have == 0 && cmd.equals("W") && num == 0) break;

            int result;
            if(cmd.equals("W")){
                result = have - num;
            }else{
                result = have + num;
            }

            if(result < -200){
                System.out.println("Not allowed");
            }else System.out.println(result);
        }
    }
}