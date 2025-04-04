import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

 
        int mingukTotal = 0;
        for (int i = 0; i < 4; i++) {
            mingukTotal += sc.nextInt();
        }

      
        int manseTotal = 0;
        for (int i = 0; i < 4; i++) {
            manseTotal += sc.nextInt();
        }

        System.out.println(Math.max(mingukTotal, manseTotal));
    }
}