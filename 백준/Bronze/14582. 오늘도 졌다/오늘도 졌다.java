import java.util.*;

public class Main {
    static String[][] time;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ulrim = new int[9];
        int[] star = new int[9];

        for(int i = 0; i < 9; i++) ulrim[i] = sc.nextInt();
        for(int i = 0; i < 9; i++) star[i] = sc.nextInt();

        int a1 = 0;
        int b1 = 0;
        boolean check = false;
        for (int i = 0; i < 9; i++) {
            a1 += ulrim[i];
            if(a1 > b1) {
                check = true;
            }
            b1 += star[i];

        }
        if(check){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
