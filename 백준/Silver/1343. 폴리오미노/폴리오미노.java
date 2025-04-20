import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static int n;
    static int[] ans;
    static int[][] board;
    static Set<String> list = new HashSet<>();

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int countX = 0;
        StringBuilder answer = new StringBuilder();
        for(char ch : s.toCharArray()) {
            if(ch == 'X'){
                countX++;
            }else{
                if(countX % 2 != 0){
                    System.out.println(-1);
                    return;
                }
                int numX = countX/4;

                for (int i = 0; i < numX; i++) {
                    answer.append("AAAA");
                }
                int num2X = countX % 4;
                if(num2X == 2){
                    answer.append("BB");
                }
                countX = 0;
                answer.append(".");
            }
        }
        if(countX % 2 != 0){
            System.out.println(-1);
            return;
        }
        int numX = countX/4;
        for (int i = 0; i < numX; i++) {
            answer.append("AAAA");
        }
        int num2X = countX % 4;
        if(num2X == 2){
            answer.append("BB");
        }
        System.out.println(answer);
    }
}
