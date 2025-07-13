import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int cnt = 0;
        int day = 1;
        while (n > 0) {
            if(n < day){
                day = 1;
                n -= day;
                cnt++;
            }else{
                n -= day;
                cnt++;
            }
            day++;
        }
        System.out.println(cnt);
    }
}
