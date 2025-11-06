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


        int idx = 1;
        StringBuilder sb = new StringBuilder();
        while (true) {
            int r = sc.nextInt(); if(r == 0) break; int w = sc.nextInt(); int l = sc.nextInt();

            double require = Math.sqrt(l * l + w * w);
            if(r * 2 >= require){
                sb.append("Pizza ").append(idx).append(" fits on the table.");
            }else sb.append("Pizza ").append(idx).append(" does not fit on the table.");
            idx++;
            sb.append("\n");
        }
        System.out.print(sb);
    }
}