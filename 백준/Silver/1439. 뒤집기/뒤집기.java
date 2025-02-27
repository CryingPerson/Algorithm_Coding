import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static ArrayList<ArrayList<Integer>> list1;
    static int n, m;
    static int[][] board;
    static int MaxSave = -1;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int area = -1;
    static int[] ch;
    static int[] paraent;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        char First = s.charAt(0);
        int cnt= 0;
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i) != First){
                cnt++;
                First = s.charAt(i);
            }
        }
        if(cnt == 1){
            System.out.println(1);
            return;
        }
        if(cnt % 2 != 0){
            System.out.println(cnt/2 + 1);
            return;
        }
        System.out.println(cnt/2);
    }
}

