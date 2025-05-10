import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static int[][] arr;
    static int[] dx = {-1, 0, 1, 0}; // 위, 오른, 아래, 왼 (x는 행)
    static int[] dy = {0, 1, 0, -1}; // 위, 오른, 아래, 왼 (y는 열)
    static int N, targetX, targetY;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(Character.isAlphabetic(ch)){
                if(Character.isUpperCase(ch)){
                    char word = (char)((ch - 'A' + 13 )% 26 + 'A');
                    sb.append(word);
                }else{
                    char word = (char) ((ch - 'a' + 13 )% 26 + 'a');
                    sb.append(word);
                }
            }else{
                sb.append(ch);
            }
        }
        System.out.println(sb);

    }
}
