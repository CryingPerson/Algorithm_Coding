import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int[][] board;

    static int result = 0;
    static int n;
    static int[][] triangle;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        char c = ' ';
        int sum = 0;
        for(char ch : s.toCharArray()) {
            if(c != ch){
                sum += 10;
            }else{
                sum += 5;
            }

            c = ch;
        }
        System.out.println(sum);
    }
}
